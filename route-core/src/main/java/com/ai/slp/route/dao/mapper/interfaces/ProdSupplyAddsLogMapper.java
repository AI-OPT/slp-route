package com.ai.slp.route.dao.mapper.interfaces;

import com.ai.slp.route.dao.mapper.bo.ProdSupplyAddsLog;
import com.ai.slp.route.dao.mapper.bo.ProdSupplyAddsLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdSupplyAddsLogMapper {
    int countByExample(ProdSupplyAddsLogCriteria example);

    int deleteByExample(ProdSupplyAddsLogCriteria example);

    int deleteByPrimaryKey(String supplyAddsLogId);

    int insert(ProdSupplyAddsLog record);

    int insertSelective(ProdSupplyAddsLog record);

    List<ProdSupplyAddsLog> selectByExample(ProdSupplyAddsLogCriteria example);

    ProdSupplyAddsLog selectByPrimaryKey(String supplyAddsLogId);

    int updateByExampleSelective(@Param("record") ProdSupplyAddsLog record, @Param("example") ProdSupplyAddsLogCriteria example);

    int updateByExample(@Param("record") ProdSupplyAddsLog record, @Param("example") ProdSupplyAddsLogCriteria example);

    int updateByPrimaryKeySelective(ProdSupplyAddsLog record);

    int updateByPrimaryKey(ProdSupplyAddsLog record);
}