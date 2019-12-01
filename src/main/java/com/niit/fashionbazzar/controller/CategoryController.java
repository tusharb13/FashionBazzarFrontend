package com.niit.fashionbazzar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;

@Controller
@ComponentScan("com.niit")
public class CategoryController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@GetMapping(value="/category")
	
	public String showCategoryPage(Model m)
	{	
		List<Category> listCategories = categoryDAO.listCategories();
		m.addAttribute("categoryList",listCategories);
		return "Category";
	}
	
	@RequestMapping(value = "/insertCategory" , method = RequestMethod.POST)
	public String insertCategory(@RequestParam("cname")String categoryName, @RequestParam("catDesc")String catDesc,Model m) {
		Category category = new Category();
		category.setCategoryName(categoryName);
		category.setCategoryDesc(catDesc);
		categoryDAO.addCategory(category);
		List<Category> listCategories = categoryDAO.listCategories();
		m.addAttribute("categoryList",listCategories);
		return "Category";
	}
	
	@RequestMapping("/deleteCategory/{categoryId}")
	public String deleteCategory(@PathVariable("categoryId")int categoryId, Model m) {
		Category category = categoryDAO.getCategory(categoryId);
		categoryDAO.deleteCategory(category);
		List<Category> listCategories = categoryDAO.listCategories();
		m.addAttribute("categoryList",listCategories);
		return "Category";
	}
	
	@RequestMapping("/editCategory/{categoryId}")
	public String editCategory(@PathVariable("categoryId")int categoryId, Model m) {
		Category category = categoryDAO.getCategory(categoryId);
		m.addAttribute("category",category);
		return "UpdateCategory";
	}
	
	@RequestMapping(value="/updateCategory", method = RequestMethod.POST)
	public String updateCategory(@RequestParam("catId")int categoryId,@RequestParam("catName")String categoryName, @RequestParam("catDesc")String catDesc,Model m) {
		
		Category category = categoryDAO.getCategory(categoryId);
		category.setCategoryName(categoryName);
		category.setCategoryDesc(catDesc);
		categoryDAO.updateCategory(category);
		List<Category> listCategories = categoryDAO.listCategories();
		m.addAttribute("categoryList",listCategories);
		return "Category";
	}
}
