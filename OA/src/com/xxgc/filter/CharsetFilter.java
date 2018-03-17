package com.xxgc.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.xxgc.bean.Employee;



public class CharsetFilter implements Filter{
 String encode="";
	public void destroy() {
		
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
	/*	List<String> list=new ArrayList<>();
	
		list.add("/a.jsp");
		list.add("/c.jsp");*/
		
	/*	
		String path=res.getServletPath();
		System.out.println(path);*/
/*	String[] va=request.getParameterValues("power");
	for(String ss:va){
		if(ss.equals(path)){
			chain.doFilter(request, response);
		}*/
		/*HttpSession session =res.getSession();*/
	/*	Object paths=session.getAttribute("purl");
		
		 System.out.println(paths);
		 if(path.equals(paths)){
			 System.out.println("succ");
		 chain.doFilter(res, response);
		 }
		 else{
			 System.out.println("nonon");
		 }*/
		
		request.setCharacterEncoding("UTF-8");
	chain.doFilter(request, response);
	}
             

          

		
	
	

	public void init(FilterConfig config) throws ServletException {
	
		encode=config.getInitParameter("encode");
		
	}

	

}
