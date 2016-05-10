package com.ai.slp.route.dao.mapper.interfaces;

import com.ai.slp.route.dao.mapper.bo.ProdSupply;
import com.ai.slp.route.dao.mapper.bo.ProdSupplyCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdSupplyMapper {
    int countByExample(ProdSupplyCriteria example);

    int deleteByExample(ProdSupplyCriteria example);

    int deleteByPrimaryKey(String supplyId);

    int insert(ProdSupply record);

    int insertSelective(ProdSupply record);

    List<ProdSupply> selectByExample(ProdSupplyCriteria example);

    ProdSupply selectByPrimaryKey(String supplyId);

    int updateByExampleSelective(@Param("record") ProdSupply record, @Param("example") ProdSupplyCriteria example);

    int updateByExample(@Param("record") ProdSupply record, @Param("example") ProdSupplyCriteria example);

    int updateByPrimaryKeySelective(ProdSupply record);

    int updateByPrimaryKey(ProdSupply record);
}