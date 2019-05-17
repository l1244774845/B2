package com.oracle.web.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.oracle.web.service.AdminService;

public class AdminHandler {
	
	private static final String NONE = null;
	@Autowired
	private AdminService adminService;
}

