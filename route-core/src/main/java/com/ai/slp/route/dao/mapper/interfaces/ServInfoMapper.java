package com.ai.slp.route.dao.mapper.interfaces;

import com.ai.slp.route.dao.mapper.bo.ServInfo;
import com.ai.slp.route.dao.mapper.bo.ServInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServInfoMapper {
    int countByExample(ServInfoCriteria example);

    int deleteByExample(ServInfoCriteria example);

    int deleteByPrimaryKey(Integer servId);

    int insert(ServInfo record);

    int insertSelective(ServInfo record);

    List<ServInfo> selectByExample(ServInfoCriteria example);

    ServInfo selectByPrimaryKey(Integer servId);

    int updateByExampleSelective(@Param("record") ServInfo record, @Param("example") ServInfoCriteria example);

    int updateByExample(@Param("record") ServInfo record, @Param("example") ServInfoCriteria example);

    int updateByPrimaryKeySelective(ServInfo record);

    int updateByPrimaryKey(ServInfo record);
}