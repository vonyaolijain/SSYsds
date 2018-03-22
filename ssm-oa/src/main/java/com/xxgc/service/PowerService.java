package com.xxgc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxgc.bean.Department;
import com.xxgc.bean.Power;
import com.xxgc.bean.Role;
import com.xxgc.dao.PowerMapper;
import com.xxgc.dao.RoleMapper;

@Service
public class PowerService {
	@Autowired
	private PowerMapper powerMapper;
	
	public List<Power> getAll() {
		
		return powerMapper.selectByExample(null);
	}


}
