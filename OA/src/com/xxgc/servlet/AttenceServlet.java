package com.xxgc.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xxgc.bean.Attence;
import com.xxgc.dao.AttenceDAO;

/**
 * Servlet implementation class AttenceServlet
 */
@WebServlet("/AttenceServlet")
public class AttenceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AttenceServlet() {
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
		if(type.equals("findall")){
			findall(request,response);
		}
		if(type.equals("add")){
			add(request,response);
			
		}
	}

	private void add(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		Date date=new Date();
		HttpSession session =request.getSession();
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String intime=	sd.format(date);
		AttenceDAO attenceDao=new AttenceDAO();
		String outtime=null;
	    int  eid=	 (int) session.getAttribute("id");
		attenceDao.add(intime, outtime, eid);
        System.out.println(intime);
   response.sendRedirect("background/index.jsp");
		
	}

	private void findall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		AttenceDAO attenceDao=new AttenceDAO();
		List<Attence> AttenceList=attenceDao.findall();
		request.setAttribute("AttenceList", AttenceList);
		request.getRequestDispatcher("background/attence_findall.jsp").forward(request, response);
		
	}

}
