package com.xxgc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xxgc.bean.Power;
import com.xxgc.conn.DBConnection;

public class PowerDAO {
public Connection conn;
public PreparedStatement ps;
public ResultSet rs;


public  PowerDAO(){
	DBConnection db=new DBConnection();
	conn=db.conn;
}
//È«²é
public List<Power> findall(){
	
	List<Power> PowerList=new ArrayList<Power>();
	String sql="select * from power";

	try {
		ps=conn.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()){
			Power power=new Power();
			power.setPid(rs.getInt(1));
			power.setPname(rs.getString(2));
			power.setPdesc(rs.getString(3));
			PowerList.add(power);
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	return PowerList;
	
	
}

}
