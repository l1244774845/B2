package com.oracle.web.service.impl;

import com.oracle.mapper.AdminMapper;
import com.oracle.web.bean.Admin;
import com.oracle.web.service.AdminService;

public class AdminServiceImpl implements AdminService {

	private AdminMapper adminMapper;

	@Override
	public int save(Admin admin) {
		// TODO Auto-generated method stub
		return this.adminMapper.save(admin);
	}

}
