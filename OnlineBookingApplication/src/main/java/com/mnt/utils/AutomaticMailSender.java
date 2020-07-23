package com.mnt.utils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class AutomaticMailSender 
{
	@Autowired
     private JavaMailSender javaMailSender;

	public AutomaticMailSender(JavaMailSender javaMailSender) {
		super();
		this.javaMailSender = javaMailSender;
	}
      
	public boolean sendAutomaticMail(String from,String to,String subject,String text)
	{
             MimeMessage mimeMessage=javaMailSender.createMimeMessage();
             MimeMessageHelper helper=new MimeMessageHelper(mimeMessage);
             try {
				helper.setTo(to);
				helper.setFrom(from);
				helper.setSubject(subject);
				helper.setText(text);
				
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             
		return false;
	}
}
