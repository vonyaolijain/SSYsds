package com.xxgc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxgc.bean.Lianhe;
import com.xxgc.bean.Prteam;

import com.xxgc.dao.PrteamMapper;

@Service
public class PrteamService {
	@Autowired
	private PrteamMapper prteamMapper;

	public List<Lianhe> getAll(Integer id) {

		return prteamMapper.selectByExampler(id);
	}

	public void delete(Integer id) {
		prteamMapper.deleteByPrimaryKey(id);
		
	}

	
	

	public void addpo(List<Prteam> plist) {
		prteamMapper.addpo(plist);		
	}

	
}
