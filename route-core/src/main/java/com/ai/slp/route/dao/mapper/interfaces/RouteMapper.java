package com.ai.slp.route.dao.mapper.interfaces;

import com.ai.slp.route.dao.mapper.bo.Route;
import com.ai.slp.route.dao.mapper.bo.RouteCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RouteMapper {
    int countByExample(RouteCriteria example);

    int deleteByExample(RouteCriteria example);

    int deleteByPrimaryKey(String routeId);

    int insert(Route record);

    int insertSelective(Route record);

    List<Route> selectByExample(RouteCriteria example);

    Route selectByPrimaryKey(String routeId);

    int updateByExampleSelective(@Param("record") Route record, @Param("example") RouteCriteria example);

    int updateByExample(@Param("record") Route record, @Param("example") RouteCriteria example);

    int updateByPrimaryKeySelective(Route record);

    int updateByPrimaryKey(Route record);
}