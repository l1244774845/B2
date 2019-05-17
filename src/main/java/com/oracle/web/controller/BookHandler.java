package com.oracle.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.oracle.web.service.BookService;

@Controller
@Scope(value = "prototype")
public class BookHandler {
	
	@Autowired
	private BookService bookService;
	
	
}

