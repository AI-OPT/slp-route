package com.ai.slp.route.dao.mapper.interfaces;

import com.ai.slp.route.dao.mapper.bo.RouteProdSupply;
import com.ai.slp.route.dao.mapper.bo.RouteProdSupplyCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RouteProdSupplyMapper {
    int countByExample(RouteProdSupplyCriteria example);

    int deleteByExample(RouteProdSupplyCriteria example);

    int deleteByPrimaryKey(String supplyId);

    int insert(RouteProdSupply record);

    int insertSelective(RouteProdSupply record);

    List<RouteProdSupply> selectByExample(RouteProdSupplyCriteria example);

    RouteProdSupply selectByPrimaryKey(String supplyId);

    int updateByExampleSelective(@Param("record") RouteProdSupply record, @Param("example") RouteProdSupplyCriteria example);

    int updateByExample(@Param("record") RouteProdSupply record, @Param("example") RouteProdSupplyCriteria example);

    int updateByPrimaryKeySelective(RouteProdSupply record);

    int updateByPrimaryKey(RouteProdSupply record);
}