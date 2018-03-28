package com.patterns.BookStoreApp.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.patterns.BookStoreApp.Model.Admin;
import com.patterns.BookStoreApp.Model.Book;
import com.patterns.BookStoreApp.Repository.AdminRepository;
import com.patterns.BookStoreApp.Repository.BookRepository;


@Controller
public class MappingController {


@Autowired
AdminRepository adminRepository;

@Autowired
BookRepository bookRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index()  {
		return "index";
	}

	@RequestMapping(value = "/adminregister", method = RequestMethod.GET)
	public ModelAndView showForm() {
	     return new ModelAndView("adminRegister", "admin", new Admin());
	}
	 
/*	@RequestMapping(value = "/adminregister", method = RequestMethod.POST)
	public String adminRegister(){
		
		return "admin";
	}*/
	
	@RequestMapping(value = "/addAdmin", method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("admin")Admin admin, 
	                     BindingResult result, ModelMap model) {
	        
		 /*   if (result.hasErrors()) {
	           return "error";
	      }
	        
	     model.addAttribute("adminname", admin.getAdminname());
          model.addAttribute("admin_password", admin.getAdmin_password());
          model.addAttribute("admin_password_confirm", admin.getAdmin_passwordConfirm());*/
	      
	      adminRepository.save(admin);

          return "adminView";
	}
	
	@RequestMapping(value = "/addBookPage", method = RequestMethod.GET)
	public String addBookPage(){
		
		return "addbook";
	}
	
	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public String addBook(@Valid @ModelAttribute("book")Book book, 
            BindingResult result, ModelMap model) {
		
		bookRepository.save(book);
		return "addbook";
	}
	
}

