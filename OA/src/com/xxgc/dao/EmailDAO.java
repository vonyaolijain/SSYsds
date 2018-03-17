package com.xxgc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;
import com.xxgc.bean.Email;
import com.xxgc.conn.DBConnection;

public class EmailDAO {
public Connection conn;
public PreparedStatement ps;
public ResultSet res;

  public EmailDAO(){
	DBConnection db=new DBConnection();
	conn=db.conn;
   }
	
  
  //²åÈë
  
  public boolean add(Email email){
	  String sql="insert into email(etitle,econtent,etime,estate,eid,eids) values('"+email.getEtitle()+"','"+email.getEcontent()+"','"+email.getEtime()+"',"+email.getEstate()+","+email.getEid()+","+email.getEids()+")";
	  System.out.println(sql);
	  try {
		ps=conn.prepareStatement(sql);
		int a=ps.executeUpdate();
		if(a>0){
			return true;
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	  
	return false;
	  
  }
}
