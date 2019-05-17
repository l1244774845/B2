package com.oracle.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oracle.web.bean.Admin;
import com.oracle.web.service.AdminService;

public class AdminHandler {
	
	private static final String NONE = null;
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public String register(Admin admin){         //注册
		
		int i = adminService.save(admin);
		
		if(i > 0){
			
			return "redirect:/Login.jsp";
			
		}else{
			
			return "redirect:/Register.jsp";
			
		}
		
	}
	
}

