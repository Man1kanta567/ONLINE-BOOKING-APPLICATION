package com.mnt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mnt.dto.UserRegistration;
import com.mnt.service.IUserRegistrationService;

@Controller
@RequestMapping("/userRegister")
public class UserRegistrationController 
{
	
	@Autowired
	private IUserRegistrationService service;
	
    @GetMapping("/demo")
    public @ResponseBody String getMessage()
    {
    	return "this is a sample demo to test the userRegistration page";
    }
    
    @GetMapping("/register")
    public String getRegister(Model model)
    {
    	model.addAttribute("user",new UserRegistration() );
    	return "userRegister";
    }
    
    @PostMapping("/successRegister")
    public String getRegisterSuccess(@ModelAttribute("user") UserRegistration registration,Model model)
    {
    	
    	String message=null;
    	model.addAttribute("msg", message);
    	return "userRegister";
    }
    
}
