package com.xxgc.dao;

import com.xxgc.bean.Power;
import com.xxgc.bean.Role;
import com.xxgc.bean.RoleExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);
  
    Role selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
   Role selectByPrimaryKeylo(Integer id);
   
   List<Power> findp(Integer id);
}