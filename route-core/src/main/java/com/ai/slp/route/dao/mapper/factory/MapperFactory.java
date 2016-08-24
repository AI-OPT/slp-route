package com.ai.slp.route.dao.mapper.factory;

import javax.annotation.PostConstruct;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.slp.route.dao.mapper.interfaces.RouteGroupMapper;
import com.ai.slp.route.dao.mapper.interfaces.RouteItemMapper;
import com.ai.slp.route.dao.mapper.interfaces.RouteMapper;
import com.ai.slp.route.dao.mapper.interfaces.RouteProdSupplyMapper;
import com.ai.slp.route.dao.mapper.interfaces.RouteSupplyAddsLogMapper;
import com.ai.slp.route.dao.mapper.interfaces.RouteTargetAreaMapper;


@Component
public class MapperFactory {

    @Autowired
    private SqlSessionTemplate st;

    private static SqlSessionTemplate sqlSessionTemplate;

    @PostConstruct
    void init() {
        setSqlSessionTemplate(st);
    }

    public static void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        MapperFactory.sqlSessionTemplate = sqlSessionTemplate;
    }

    
    public static RouteMapper getRouteMapper() {
        return sqlSessionTemplate.getMapper(RouteMapper.class);
    }
    public static RouteGroupMapper getRouteGroupMapper() {
        return sqlSessionTemplate.getMapper(RouteGroupMapper.class);
    }
    public static RouteItemMapper getRouteItemMapper() {
        return sqlSessionTemplate.getMapper(RouteItemMapper.class);
    }
    public static RouteProdSupplyMapper getRouteProdSupplyMapper() {
        return sqlSessionTemplate.getMapper(RouteProdSupplyMapper.class);
    }
    public static RouteSupplyAddsLogMapper getRouteSupplyAddsLogMapper() {
        return sqlSessionTemplate.getMapper(RouteSupplyAddsLogMapper.class);
    }
    public static RouteTargetAreaMapper getRouteTargetAreaMapper() {
        return sqlSessionTemplate.getMapper(RouteTargetAreaMapper.class);
    }
}
