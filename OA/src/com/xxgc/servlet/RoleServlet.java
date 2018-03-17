package com.xxgc.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxgc.bean.Role;
import com.xxgc.dao.RoleDAO;

/**
 * Servlet implementation class RoleServlet
 */
@WebServlet("/RoleServlet")
public class RoleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RoleServlet() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
  public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type=request.getParameter("type");
		if(type.equals("Findall")){
			Findall(request,response);
		}
	}

	public  void Findall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	  RoleDAO RoleDao=new RoleDAO();
	  List<Role> RoleList=new ArrayList<Role>();
		RoleList=RoleDao.findall();
		request.setAttribute("RoleList", RoleList);
		request.getRequestDispatcher("background/role_findall.jsp").forward(request, response);
	}

}
