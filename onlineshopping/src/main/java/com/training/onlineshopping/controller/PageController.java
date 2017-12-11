package com.training.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.shoppingbackend.dao.CategoryDao;
import com.training.shoppingbackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDao categoryDAO;
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "Home");
		//Passing the list of categories
		mav.addObject("categories",categoryDAO.list());
		mav.addObject("userClickHome", true);
		return mav;
	}
	
	@RequestMapping(value = {"/about"})
	public ModelAndView about() {
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "About Us");
		mav.addObject("userClickAbout", true);
		return mav;
	}
	
	@RequestMapping(value = {"/contact"})
	public ModelAndView contact() {
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "Contact");
		mav.addObject("userClickContact", true);
		return mav;
	}
	
	@RequestMapping(value = {"/show/all/products"})
	public ModelAndView showAllProducts() {
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "All Products");
		//Passing the list of categories
		mav.addObject("categories",categoryDAO.list());
		mav.addObject("userClickAllProducts", true);
		return mav;
	}
	
	@RequestMapping(value = {"/show/category/{id}/products"})
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("page");
		
		Category category = null;
		category = categoryDAO.get(id);
		
		mav.addObject("title", category.getName());
		//Passing the list of categories
		mav.addObject("categories",categoryDAO.list());
		mav.addObject("category",category);
		mav.addObject("userClickCategoryProducts", true);
		return mav;
	}
	
	
	
	/*@RequestMapping(value = "/test")
	public ModelAndView testRequest(@RequestParam(value = "greeting", required=false)String greeting) {
		if(greeting == null) {
			greeting = "hello world!";
		}
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("greeting", greeting);
		return mav;
	}
	
	@RequestMapping(value = "/test/{greeting}")
	public ModelAndView testPath(@PathVariable("greeting")String greeting) {
		if(greeting == null) {
			greeting = "hello world!";
		}
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("greeting", greeting);
		return mav;
	}*/
}
