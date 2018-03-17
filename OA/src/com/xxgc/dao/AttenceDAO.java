package com.xxgc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xxgc.bean.Attence;
import com.xxgc.conn.DBConnection;

public class AttenceDAO {
	
public Connection conn;
public PreparedStatement ps;
public ResultSet re;
public AttenceDAO() {
	DBConnection db=new DBConnection();
	conn=db.conn;
	
}
//²åÈë
	public boolean add(String intime,String outtime,int eid){
		
		String sql="insert into attence (intime,outtime,eid) values('"+intime+"','"+outtime+"',"+eid+")";
		try {
			ps=conn.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return false;
	}
	//È«²é
	
	public List<Attence> findall(){
		List<Attence> AttenceList=new ArrayList<Attence>();
		String sql="select * from attence";
		try {
			ps=conn.prepareStatement(sql);
			re=ps.executeQuery();
			while(re.next()){
				Attence attence=new Attence();
				attence.setId(re.getInt(1));
				attence.setIntime(re.getString(2));
				attence.setOuttime(re.getString(3));
				AttenceList.add(attence);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return AttenceList;

	}
	}
