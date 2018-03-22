package com.xxgc.dao;

import com.xxgc.bean.Power;
import com.xxgc.bean.PowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowerMapper {
    long countByExample(PowerExample example);

    int deleteByExample(PowerExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Power record);

    int insertSelective(Power record);

    List<Power> selectByExample(PowerExample example);
  
    Power selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Power record, @Param("example") PowerExample example);

    int updateByExample(@Param("record") Power record, @Param("example") PowerExample example);

    int updateByPrimaryKeySelective(Power record);

    int updateByPrimaryKey(Power record);
}