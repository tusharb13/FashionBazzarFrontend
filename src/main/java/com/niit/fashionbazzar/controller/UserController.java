package com.niit.fashionbazzar.controller;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
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
public class UserController {
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("/login_success")
	public String loginSuccess(HttpSession session,Model m) {
		System.out.println("=========== Successful Login ===========");
		String page= "";
		boolean loggedIn = false;
		SecurityContext sContext = SecurityContextHolder.getContext();
		Authentication authentication = sContext.getAuthentication();
		String username = authentication.getName();
		
		Collection<GrantedAuthority> roles = (Collection<GrantedAuthority>)authentication.getAuthorities();
		
		for(GrantedAuthority role :roles) {
			session.setAttribute("role",role.getAuthority());
			if(role.getAuthority().equals("ROLE_ADMIN")) {
				loggedIn = true;
				page= "AdminHome";
				session.setAttribute("loggedIn",loggedIn);
				session.setAttribute("username",username);
			}
			else {
				List<Product> productList = productDAO.listProducts();
				m.addAttribute("productList", productList);
				loggedIn = true;
				page= "UserHome";
				session.setAttribute("loggedIn",loggedIn);
				session.setAttribute("username",username);
			}
		}
		return page;
		//return "Register";
	}
	
	
	
}
