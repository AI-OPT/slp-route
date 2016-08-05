package com.ai.slp.route.dao.mapper.interfaces;

import com.ai.slp.route.dao.mapper.bo.RouteSupplyAddsLog;
import com.ai.slp.route.dao.mapper.bo.RouteSupplyAddsLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RouteSupplyAddsLogMapper {
    int countByExample(RouteSupplyAddsLogCriteria example);

    int deleteByExample(RouteSupplyAddsLogCriteria example);

    int deleteByPrimaryKey(String supplyAddsLogId);

    int insert(RouteSupplyAddsLog record);

    int insertSelective(RouteSupplyAddsLog record);

    List<RouteSupplyAddsLog> selectByExample(RouteSupplyAddsLogCriteria example);

    RouteSupplyAddsLog selectByPrimaryKey(String supplyAddsLogId);

    int updateByExampleSelective(@Param("record") RouteSupplyAddsLog record, @Param("example") RouteSupplyAddsLogCriteria example);

    int updateByExample(@Param("record") RouteSupplyAddsLog record, @Param("example") RouteSupplyAddsLogCriteria example);

    int updateByPrimaryKeySelective(RouteSupplyAddsLog record);

    int updateByPrimaryKey(RouteSupplyAddsLog record);
}