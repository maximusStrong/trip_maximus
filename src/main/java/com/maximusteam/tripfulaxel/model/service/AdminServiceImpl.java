package com.maximusteam.tripfulaxel.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maximusteam.tripfulaxel.model.dao.AdminMapper;


@Service
public class AdminServiceImpl implements AdminService {

	private AdminMapper mapper;
	
	@Autowired
	public AdminServiceImpl(AdminMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public List<AdminDTO> selectAdmin(AdminDTO admin) {
		return mapper.selectAdmin(admin);
	}
}
