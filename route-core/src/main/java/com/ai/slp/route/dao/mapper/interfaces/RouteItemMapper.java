package com.ai.slp.route.dao.mapper.interfaces;

import com.ai.slp.route.dao.mapper.bo.RouteItem;
import com.ai.slp.route.dao.mapper.bo.RouteItemCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RouteItemMapper {
    int countByExample(RouteItemCriteria example);

    int deleteByExample(RouteItemCriteria example);

    int deleteByPrimaryKey(String routeItemId);

    int insert(RouteItem record);

    int insertSelective(RouteItem record);

    List<RouteItem> selectByExample(RouteItemCriteria example);

    RouteItem selectByPrimaryKey(String routeItemId);

    int updateByExampleSelective(@Param("record") RouteItem record, @Param("example") RouteItemCriteria example);

    int updateByExample(@Param("record") RouteItem record, @Param("example") RouteItemCriteria example);

    int updateByPrimaryKeySelective(RouteItem record);

    int updateByPrimaryKey(RouteItem record);
}