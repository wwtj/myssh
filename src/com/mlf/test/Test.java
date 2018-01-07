package com.mlf.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mlf.domain.User;
import com.mlf.service.itf.IUserService;

public class Test {
	public static void main(String[] args){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService userService = (IUserService) ac.getBean("userServiceImpl");
		
		User user = new User("3", "ÅåÂÞÄÈ", "1", "15866617879", "01", 100.0);
		
		userService.addUser(user);
	}
}
