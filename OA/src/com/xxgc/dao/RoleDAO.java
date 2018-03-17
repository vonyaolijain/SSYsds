package com.xxgc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xxgc.bean.Role;
import com.xxgc.conn.DBConnection;

public class RoleDAO {
public Connection conn;
public PreparedStatement ps;
public ResultSet rs;
public RoleDAO() {
	DBConnection db=new DBConnection();
	conn=db.conn;
}
//È«²é
public List<Role> findall(){
	
	List<Role> RoleList=new ArrayList<Role>();
	String sql="select * from role";
	try {
		ps=conn.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()){
			Role role=new Role();
			role.setId(rs.getInt(1));
			role.setRname(rs.getString(2));
			role.setRdesc(rs.getString(3));
			RoleList.add(role);
			
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	
	
	
	return RoleList;
	
	
	
}



}
