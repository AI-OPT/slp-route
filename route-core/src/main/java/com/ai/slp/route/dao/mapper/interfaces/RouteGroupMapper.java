package com.ai.slp.route.dao.mapper.interfaces;

import com.ai.slp.route.dao.mapper.bo.RouteGroup;
import com.ai.slp.route.dao.mapper.bo.RouteGroupCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RouteGroupMapper {
    int countByExample(RouteGroupCriteria example);

    int deleteByExample(RouteGroupCriteria example);

    int deleteByPrimaryKey(String routeGroupId);

    int insert(RouteGroup record);

    int insertSelective(RouteGroup record);

    List<RouteGroup> selectByExample(RouteGroupCriteria example);

    RouteGroup selectByPrimaryKey(String routeGroupId);

    int updateByExampleSelective(@Param("record") RouteGroup record, @Param("example") RouteGroupCriteria example);

    int updateByExample(@Param("record") RouteGroup record, @Param("example") RouteGroupCriteria example);

    int updateByPrimaryKeySelective(RouteGroup record);

    int updateByPrimaryKey(RouteGroup record);
}