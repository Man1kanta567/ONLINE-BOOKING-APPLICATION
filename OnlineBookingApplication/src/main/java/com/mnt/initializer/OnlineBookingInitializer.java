package com.mnt.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.mnt.config.OnlineBookingApplicationConfiguration;

public class OnlineBookingInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext applicationContext=new AnnotationConfigWebApplicationContext();
		applicationContext.register(OnlineBookingApplicationConfiguration.class);
		DispatcherServlet dispatcherServlet=new DispatcherServlet(applicationContext);
		ServletRegistration.Dynamic dynamic=servletContext.addServlet("myFrontController",dispatcherServlet);
	    dynamic.addMapping("/myapp/*");
	    
		
	}

}
