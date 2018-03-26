package com.xxgc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xxgc.bean.Prteam;
import com.xxgc.service.PrteamService;

@Controller
public class PrteamController {
	@Autowired
	PrteamService prteamService;

	@RequestMapping(value = "rpower_delete")
	public String delete(@Param(value = "id") Integer id, @Param(value = "rid") Integer rid) {
		prteamService.delete(id);
		System.out.println("succscc45");
		String url = "redirect:ro_getpo?id=" + rid;// 拼接url
		return url;
	}

	@RequestMapping(value = "add_ropo")
	public String  add(HttpServletRequest request, HttpServletResponse response) {
		String[] pids = request.getParameterValues("pid");
		String rids = request.getParameter("rid");
		Integer rid = Integer.parseInt(rids);
		List<Prteam> plist = new ArrayList<Prteam>();
		for (String p : pids) {
			Prteam pr = new Prteam();
			Integer pid = Integer.parseInt(p);
			pr.setPid(pid);
			pr.setRid(rid);
			plist.add(pr);
		}
		System.out.println(plist);
		prteamService.addpo(plist);
		String url = "redirect:ro_getpo?id=" + rid;// 拼接url
		return url; 
	}
	
}
