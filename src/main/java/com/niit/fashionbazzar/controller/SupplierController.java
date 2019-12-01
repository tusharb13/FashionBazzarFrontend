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
import com.niit.dao.SupplierDAO;
import com.niit.model.Category;
import com.niit.model.Supplier;

@Controller
@ComponentScan("com.niit")
public class SupplierController {

	@Autowired
	private SupplierDAO supplierDAO;
	
	@GetMapping(value="/supplier")
	
	public String showCategoryPage(Model m)
	{	
		List<Supplier> listSuppliers = supplierDAO.listSupplier();
		m.addAttribute("supplierList",listSuppliers);
		return "Supplier";
	}
	
	@RequestMapping(value = "/insertSupplier" , method = RequestMethod.POST)
	public String insertSupplier(@RequestParam("sname")String supplierName, @RequestParam("supDesc")int supDesc,Model m) {
		Supplier supplier = new Supplier();
		supplier.setSupplierName(supplierName);
		supplier.setSupplierAddress(supDesc);
		supplierDAO.addSupplier(supplier);
		List<Supplier> listSuppliers = supplierDAO.listSupplier();
		m.addAttribute("supplierList",listSuppliers);
		return "Supplier";
	}
	
	@RequestMapping("/deleteSupplier/{supplierId}")
	public String deleteSupplier(@PathVariable("supplierId")int supplierId, Model m) {
		Supplier supplier = supplierDAO.getSupplier(supplierId);
		supplierDAO.deleteSupplier(supplier);
		List<Supplier> listSuppliers = supplierDAO.listSupplier();
		m.addAttribute("supplierList",listSuppliers);
		return "Supplier";
	}
	
	@RequestMapping("/editSupplier/{supplierId}")
	public String editSupplier(@PathVariable("supplierId")int supplierId, Model m) {
		Supplier supplier = supplierDAO.getSupplier(supplierId);
		m.addAttribute("supplier",supplier);
		return "UpdateSupplier";
	}
	
	@RequestMapping(value="/updateSupplier", method = RequestMethod.POST)
	public String updateSupplier(@RequestParam("supId")int supplierId,@RequestParam("supName")String supplierName, @RequestParam("supDesc")int supDesc,Model m) {
		
		Supplier supplier = supplierDAO.getSupplier(supplierId);
		supplier.setSupplierName(supplierName);
		supplier.setSupplierAddress(supDesc);
		supplierDAO.updateSupplier(supplier);
		List<Supplier> listSuppliers = supplierDAO.listSupplier();
		m.addAttribute("supplierList",listSuppliers);
		return "Supplier";
	}
}
