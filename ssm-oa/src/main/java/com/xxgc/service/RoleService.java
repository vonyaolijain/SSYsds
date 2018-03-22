package com.xxgc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxgc.bean.Department;
import com.xxgc.bean.Role;
import com.xxgc.dao.RoleMapper;

@Service
public class RoleService {
	@Autowired
	private RoleMapper roleMapper;
	public Role logins(Integer rid) {
		return roleMapper.selectByPrimaryKeylo(rid);
	}
	public List<Role> getAll() {
		
		return roleMapper.selectByExample(null);
	}


}
