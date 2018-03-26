package com.xxgc.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxgc.bean.Department;
import com.xxgc.bean.Power;
import com.xxgc.bean.Role;
import com.xxgc.dao.PowerMapper;
import com.xxgc.dao.RoleMapper;

@Service
public class RoleService {
	@Autowired
	private RoleMapper roleMapper;
	@Autowired
	private PowerMapper powerMapper;
	public Role logins(Integer rid) {
		return roleMapper.selectByPrimaryKeylo(rid);
	}

	public List<Role> getAll() {

		return roleMapper.selectByExample(null);
	}

	// 查询角色没有的权限
	public List<Power> findp(Integer id) {

		return roleMapper.findp(id);
	}
}
