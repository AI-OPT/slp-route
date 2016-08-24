package com.ai.slp.route.dao.mapper.interfaces;

import com.ai.slp.route.dao.mapper.bo.RouteTargetArea;
import com.ai.slp.route.dao.mapper.bo.RouteTargetAreaCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RouteTargetAreaMapper {
    int countByExample(RouteTargetAreaCriteria example);

    int deleteByExample(RouteTargetAreaCriteria example);

    int deleteByPrimaryKey(String routeAreaId);

    int insert(RouteTargetArea record);

    int insertSelective(RouteTargetArea record);

    List<RouteTargetArea> selectByExample(RouteTargetAreaCriteria example);

    RouteTargetArea selectByPrimaryKey(String routeAreaId);

    int updateByExampleSelective(@Param("record") RouteTargetArea record, @Param("example") RouteTargetAreaCriteria example);

    int updateByExample(@Param("record") RouteTargetArea record, @Param("example") RouteTargetAreaCriteria example);

    int updateByPrimaryKeySelective(RouteTargetArea record);

    int updateByPrimaryKey(RouteTargetArea record);
}