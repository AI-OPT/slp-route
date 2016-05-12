package com.ai.slp.route.dao.mapper.interfaces;

import com.ai.slp.route.dao.mapper.bo.RouteServInfo;
import com.ai.slp.route.dao.mapper.bo.RouteServInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RouteServInfoMapper {
    int countByExample(RouteServInfoCriteria example);

    int deleteByExample(RouteServInfoCriteria example);

    int deleteByPrimaryKey(Integer servId);

    int insert(RouteServInfo record);

    int insertSelective(RouteServInfo record);

    List<RouteServInfo> selectByExample(RouteServInfoCriteria example);

    RouteServInfo selectByPrimaryKey(Integer servId);

    int updateByExampleSelective(@Param("record") RouteServInfo record, @Param("example") RouteServInfoCriteria example);

    int updateByExample(@Param("record") RouteServInfo record, @Param("example") RouteServInfoCriteria example);

    int updateByPrimaryKeySelective(RouteServInfo record);

    int updateByPrimaryKey(RouteServInfo record);
}