package com.xxgc.dao;

import com.xxgc.bean.Lianhe;
import com.xxgc.bean.Prteam;
import com.xxgc.bean.PrteamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrteamMapper {
    long countByExample(PrteamExample example);

    int deleteByExample(PrteamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Prteam record);

    int insertSelective(Prteam record);

    List<Prteam> selectByExample(PrteamExample example);
   
    List<Lianhe> selectByExampler(Integer id);
    
    Prteam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Prteam record, @Param("example") PrteamExample example);

    int updateByExample(@Param("record") Prteam record, @Param("example") PrteamExample example);

    int updateByPrimaryKeySelective(Prteam record);

    int updateByPrimaryKey(Prteam record);

	

	void addpo(@Param("plist") List<Prteam> plist);

	


}