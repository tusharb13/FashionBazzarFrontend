package com.niit.fashionbazzar.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.dao.CartDAO;
import com.niit.dao.OrderDAO;
import com.niit.dao.UserDAO;
import com.niit.model.Cart;

@Controller
public class PaymentController {
	
	@Autowired
	private CartDAO cartDAO;
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private OrderDAO orderDAO;
	
	@RequestMapping(value = "/showPayment")
	public String makePayment(HttpSession session, Model m) {
		String username = (String)session.getAttribute("username");
		List<Cart> cartItemList = cartDAO.listCartItems(username);
		m.addAttribute("listCartItems", cartItemList);
		m.addAttribute("total_Amount", totalCartValue(cartItemList));
		m.addAttribute("address", userDAO.getUserDetail(username).getAddress());
		return "Payment";
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
	
	@RequestMapping(value = "/reciept", method=RequestMethod.POST)
	public String generateReciept(Model m, HttpSession session) {
		String username = (String)session.getAttribute("username");
		List<Cart> cartItemList = cartDAO.listCartItems(username);
		m.addAttribute("listCartItems", cartItemList);
		m.addAttribute("total_Amount", totalCartValue(cartItemList));
		m.addAttribute("address", userDAO.getUserDetail(username).getAddress());
		return "Reciept";
	}

}
