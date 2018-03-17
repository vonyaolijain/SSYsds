package com.xxgc.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxgc.bean.Power;
import com.xxgc.dao.PowerDAO;

/**
 * Servlet implementation class PowerServlet
 */
@WebServlet("/PowerServlet")
public class PowerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PowerServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type=request.getParameter("type");
		if(type.equals("Findall")){
			Findall(request,response);
		}
	}

	public  void Findall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PowerDAO PowerDao=new PowerDAO();
		List<Power> PowerList=new ArrayList<Power>();
		
		PowerList =PowerDao.findall();
	
		request.setAttribute("PowerList", PowerList);
		request.getRequestDispatcher("background/power_findall.jsp").forward(request, response);
	}

}
