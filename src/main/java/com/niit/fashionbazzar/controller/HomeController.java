package com.niit.fashionbazzar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.dao.CategoryDAO;
import com.niit.dao.ProductDAO;
import com.niit.model.Category;
import com.niit.model.Product;

@Controller
public class HomeController {
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;

	@GetMapping("/")
	public String homePage()
	{
		return "index";
	}
	
	@GetMapping(value="/register")
	public String showRegisterPage()
	{
		return "Register";
	}
	
	@RequestMapping(value="/contactus")
	public String showContactUsPage()
	{
		return "ContactUs";
	}
	
	@RequestMapping(value="/aboutus")
	public String showAboutUsPage()
	{
		return "AboutUs";
	}
	
	@RequestMapping(value="/category")
	public String showCategoryPage()
	{
		return "Category";
	}
	
	@RequestMapping(value="/supplier")
	public String showSupplierPage()
	{
		return "Supplier";
	}
	
	@RequestMapping(value="/login")
	public String showLoginPage()
	{
		return "Login";
	}
	
	
	

}
