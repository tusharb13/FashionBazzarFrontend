package com.niit.fashionbazzar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.dao.CartDAO;
import com.niit.dao.CategoryDAO;
import com.niit.dao.ProductDAO;
import com.niit.model.Cart;
import com.niit.model.Product;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

@Controller
public class CartController {
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private CartDAO cartDAO;
	
	@RequestMapping(value = "/cart")
	public String showCart(Model m, HttpSession session) {
		String username = (String)session.getAttribute("username");
		List<Cart> cartItemList = cartDAO.listCartItems(username);
		m.addAttribute("listCartItems", cartItemList);
		m.addAttribute("total_Amount", this.totalCartValue(cartItemList));
		return "Cart";
	}
	
	@RequestMapping(value = "/addToCart/{productId}")
	public String addToCart(@PathVariable("productId") int productId, @RequestParam("quantity") int quantity, Model m, HttpSession session ) {
		Product product = productDAO.getProduct(productId);
		String username = (String)session.getAttribute("username");
		
		Cart cartItem = new Cart();
		cartItem.setProductID(product.getProductId());
		cartItem.setPrice(product.getPrice());
		cartItem.setQuantity(quantity);
		cartItem.setStatus("NP");
		cartItem.setUsername(username);
		
		cartDAO.addToCart(cartItem);
		
		List<Cart> cartItemList = cartDAO.listCartItems(username);
		m.addAttribute("listCartItems", cartItemList);
		m.addAttribute("total_Amount", this.totalCartValue(cartItemList));
		return "Cart";
	}
	
	@RequestMapping(value = "/deleteCartItem/{cartItemId}")
	public String deleteCartItem(@PathVariable("cartItemId") int cartItemId,Model m, HttpSession session) {
		Cart cartItem = cartDAO.getcartItem(cartItemId);
		cartDAO.deleteCartItem(cartItem);
		String username = (String)session.getAttribute("username");
		List<Cart> cartItemList = cartDAO.listCartItems(username);
		m.addAttribute("listCartItems", cartItemList);
		m.addAttribute("total_Amount", this.totalCartValue(cartItemList));
		return "Cart";
	}
	
	@RequestMapping(value = "/updateCartItem/{cartItemId}")
	public String updateCartItem (@PathVariable("cartItemId") int cartItemId,@RequestParam("quantity") int quantity,Model m, HttpSession session) {
		Cart cartItem = cartDAO.getcartItem(cartItemId);
		cartItem.setQuantity(quantity);
		cartDAO.updateCartItem(cartItem);
		String username = (String)session.getAttribute("username");
		List<Cart> cartItemList = cartDAO.listCartItems(username);
		m.addAttribute("listCartItems", cartItemList);
		m.addAttribute("total_Amount", this.totalCartValue(cartItemList));
		return "Cart";
	}
	
	public int totalCartValue(List<Cart> cartItemList) {
		int totalCost = 0;
		int i =0;
		while(i<cartItemList.size()) {
			Cart cartItem = cartItemList.get(i);
			totalCost = (int) (totalCost + (cartItem.getPrice()*cartItem.getQuantity()));
			i++;
		}
		return totalCost;
	}
	
	@RequestMapping(value = "/checkout")
	public String confirmOrder(Model m, HttpSession session) {
		
		String username = (String)session.getAttribute("username");
		List<Cart> cartItemList = cartDAO.listCartItems(username);
		m.addAttribute("listCartItems", cartItemList);
		m.addAttribute("total_Amount", this.totalCartValue(cartItemList));
		return "OrderConfirm";
	}

}
