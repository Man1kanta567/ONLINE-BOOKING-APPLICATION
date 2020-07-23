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
import com.mnt.utils.AutomaticMailSender;

@Controller
@RequestMapping("/userRegister")
public class UserRegistrationController 
{
	
	@Autowired
	private IUserRegistrationService service;
	
	@Autowired
	private AutomaticMailSender sender;
	
    @GetMapping("/demo")
    public @ResponseBody String getMessage()
    {
    	return "this is a sample demo to test the userRegistration page";
    }
    
    @GetMapping("/register")
    public String getRegister(Model model)
    {
    	model.addAttribute("user",new UserRegistration() );
    	return "UserRegistration";
    }
    
    @PostMapping("/successRegister")
    public String getRegisterSuccess(@ModelAttribute("user") UserRegistration registration,Model model)
    {
    	System.out.println(registration);
    	String message=null;
    	Integer id=service.insertDetails(registration);
    	if(id>0) {
              new Thread(new Runnable()
            		  {
                     
						@Override
						public void run() {
					
							
						} 
              
            		  }).start();
    		message="User is successfully registered with id "+id;
    	}
    	else 
    	{
    		 message="there is a problem in the network ..please try again later..";
    	}
    	model.addAttribute("msg", message);
    	return "UserRegistration";
    }
    
}
