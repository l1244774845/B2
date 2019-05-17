package com.oracle.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.mapper.BookMapper;
import com.oracle.web.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookMapper bookMapper;
	
	
	
}
