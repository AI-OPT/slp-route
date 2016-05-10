package com.ai.slp.route.dao.mapper.interfaces;

import com.ai.slp.route.dao.mapper.bo.RouteRule;
import com.ai.slp.route.dao.mapper.bo.RouteRuleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RouteRuleMapper {
    int countByExample(RouteRuleCriteria example);

    int deleteByExample(RouteRuleCriteria example);

    int deleteByPrimaryKey(String routeRuleId);

    int insert(RouteRule record);

    int insertSelective(RouteRule record);

    List<RouteRule> selectByExample(RouteRuleCriteria example);

    RouteRule selectByPrimaryKey(String routeRuleId);

    int updateByExampleSelective(@Param("record") RouteRule record, @Param("example") RouteRuleCriteria example);

    int updateByExample(@Param("record") RouteRule record, @Param("example") RouteRuleCriteria example);

    int updateByPrimaryKeySelective(RouteRule record);

    int updateByPrimaryKey(RouteRule record);
}