package com.niit.fashionbazzar.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.niit.dao.CategoryDAO;
import com.niit.dao.ProductDAO;
import com.niit.model.Category;
import com.niit.model.Product;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

@Controller
public class ProductController {
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	@RequestMapping("/product")
	public String showProductPage(Model m) {
		Product product = new Product();
		List<Product> productList = productDAO.listProducts();
		
		m.addAttribute("product",product);
		m.addAttribute("productList", productList);
		List<Category> categoryList = categoryDAO.listCategories();
		m.addAttribute("categoryList", this.getCategoryList(categoryList));
		return "Product";
		
	}
	

	@RequestMapping(value = "/InsertProduct", method=RequestMethod.POST )
	public String insertProduct(@ModelAttribute("product") Product product, Model m, @RequestParam ("pimage") MultipartFile filedet) {
		Product product1 = new Product();
		m.addAttribute("product",product1);
		productDAO.addProduct(product);
		
		//image
		String imagePath = "D:\\DTproject\\Workspace\\FashionBazzarFrontend\\src\\main\\webapp\\WEB-INF\\resources\\images\\";
		imagePath += String.valueOf(product.getProductId()) +".jpg";
		File imageFile = new File(imagePath);
		
		if(!filedet.isEmpty()) {
			try {
				byte fileBuffer[] = filedet.getBytes();
				FileOutputStream fos = new FileOutputStream(imageFile);
				BufferedOutputStream bs = new BufferedOutputStream(fos);
				bs.write(fileBuffer);
				bs.close();
			}
			catch(Exception ex) {
				System.out.println(ex);
			}
		}
		else {
			System.out.println("Error occured during image upload");
		}
		
		
		List<Product> productList = productDAO.listProducts();
		m.addAttribute("productList", productList);
		
		
		List<Category> categoryList = categoryDAO.listCategories();
		m.addAttribute("categoryList", this.getCategoryList(categoryList));
		return "Product";
	}
	
	@RequestMapping(value = "/deleteProduct/{productId}" )
	public String deleteProduct(@PathVariable("productId") int productId, Model m) {
		Product product1 = new Product();
		m.addAttribute("product",product1);
		
		Product product = productDAO.getProduct(productId);
		productDAO.deleteProduct(product);
		
		List<Product> productList = productDAO.listProducts();
		m.addAttribute("productList", productList);
		
		
		List<Category> categoryList = categoryDAO.listCategories();
		m.addAttribute("categoryList", this.getCategoryList(categoryList));
		return "Product";
	}
	
	public LinkedHashMap<Integer, String> getCategoryList(List<Category> categoryList){
		LinkedHashMap<Integer, String> categoryList1 = new LinkedHashMap<Integer, String>();
		for(Category category:categoryList) {
			categoryList1.put(category.getCategoryId(), category.getCategoryName());
			
		}
		return categoryList1;
	}
	
	@RequestMapping(value = "/editProduct/{productId}" )
	public String editProduct(@PathVariable("productId") int productId, Model m) {
			
		Product product1 = productDAO.getProduct(productId);
		m.addAttribute("product",product1);
		
		List<Product> productList = productDAO.listProducts();
		m.addAttribute("productList", productList);
				
		List<Category> categoryList = categoryDAO.listCategories();
		m.addAttribute("categoryList", this.getCategoryList(categoryList));
		
		return "Product";
	}
	
	@RequestMapping(value = "/productdisplay")
	public String productDisplay(Model m) {
		List<Product> productList = productDAO.listProducts();
		m.addAttribute("productList", productList);
		
		List<Category> categoryList = categoryDAO.listCategories();
		m.addAttribute("categoryList", this.getCategoryList(categoryList));
		
		return "ProductDisplay";
		
	}
	
	@RequestMapping(value = "/ttotalProductDisplay/{productId}")
	public String totalProductDisplay(@PathVariable("productId") int productId, Model m) {
		
		Product product1 = productDAO.getProduct(productId);
		m.addAttribute("product",product1);
		
		List<Category> categoryList = categoryDAO.listCategories();
		m.addAttribute("categoryList", this.getCategoryList(categoryList));
		
		return "TotalProductDisplay";
	}
	
	
	
}
