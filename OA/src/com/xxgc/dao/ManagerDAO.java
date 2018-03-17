package com.xxgc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xxgc.conn.DBConnection;

public class ManagerDAO {
  public Connection conn;
  public PreparedStatement pst;
  public ResultSet res;
  public ManagerDAO(){
	  DBConnection db=new DBConnection();
	 conn=db.conn;
  }
	//login
  public boolean login(String username,String password){
	  String sql="select * from manager where username='"+username+"' and password='"+password+"'";
	  
	  try {
		pst=conn.prepareStatement(sql);
		res=pst.executeQuery();
	
		if(res.next()){
			return true;
		}else{
			return false;
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	  
	  
	return false;
	  
  }
  
  
}
