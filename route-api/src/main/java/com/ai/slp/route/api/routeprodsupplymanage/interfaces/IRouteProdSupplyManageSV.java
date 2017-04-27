package com.ai.slp.route.api.routeprodsupplymanage.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 * 
 *
 * Date: 2016年8月5日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * @author zhangzd
 */

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.route.api.routeprodsupplymanage.param.CostPriceUpdateListRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.CostPriceUpdateResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.ProductCatIdListResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteAmountResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyAddListRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyAddResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyPageSearchResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyRouteIdRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.RouteProdSupplyUpdateUsableNumResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdIdListResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdIdPageSearchRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdIdRequest;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdRouteListResponse;
import com.ai.slp.route.api.routeprodsupplymanage.param.StandedProdRoutePageSearchResponse;
@Path("/RouteProdSupplyManage")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IRouteProdSupplyManageSV {
	/**
	 * 仓库中商品列表 分页查询
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteProdSupplyManage-001
     * @RestRelativeURL RouteProdSupplyManage/queryPageSearch
     */
	@POST
	@Path("/queryPageSearch")
	public RouteProdSupplyPageSearchResponse queryPageSearch(RouteProdSupplyPageSearchRequest request)throws BusinessException,SystemException;
	/**
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteProdSupplyManage-002
     * @RestRelativeURL RouteProdSupplyManage/updateUsableNum
     */
	@POST
	@Path("/updateUsableNum")
	public RouteProdSupplyUpdateUsableNumResponse updateUsableNum(RouteProdSupplyUpdateUsableNumRequest request)throws BusinessException,SystemException;
	/**
	 * 批量给仓库配置商品信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteProdSupplyManage-003
     * @RestRelativeURL RouteProdSupplyManage/addRouteProdSupplyList
     */
	@POST
	@Path("/addRouteProdSupplyList")
	public RouteProdSupplyAddResponse addRouteProdSupplyList(RouteProdSupplyAddListRequest request)throws BusinessException,SystemException;
	
	/**
	 * 批量给仓库配置商品信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteProdSupplyManage-003
	 * @RestRelativeURL RouteProdSupplyManage/addRouteProdSupply
	 */
	@POST
	@Path("/addRouteProdSupply")
	public RouteProdResponse addRouteProdSupply(RouteProdSupplyAddListRequest request)throws BusinessException,SystemException;
	
	/**
	 * 根据仓库编号和租户编号查询当前仓库下的标准品编号列表
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteProdSupplyManage-004
     * @RestRelativeURL RouteProdSupplyManage/queryStandedProdIdList
     */
	@POST
	@Path("/queryStandedProdIdList")
	public StandedProdIdListResponse queryStandedProdIdList(RouteProdSupplyRouteIdRequest request)throws BusinessException,SystemException;
	/**
	 * 根据商品编号查询仓库数量
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteProdSupplyManage-005
     * @RestRelativeURL RouteProdSupplyManage/queryRouteAmount
     */
	@POST
	@Path("/queryRouteAmount")
	public RouteAmountResponse queryRouteAmount(StandedProdIdRequest request)throws BusinessException,SystemException;

	/**
	 * 根据商品编号查询商品的仓库列表
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteProdSupplyManage-006
     * @RestRelativeURL RouteProdSupplyManage/queryStandedProdRouteList
     */
	@POST
	@Path("/queryStandedProdRouteList")
	public StandedProdRouteListResponse queryStandedProdRouteList(StandedProdIdRequest request)throws BusinessException,SystemException;
	/**
	 * 修改商品成本价
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteProdSupplyManage-007
     * @RestRelativeURL RouteProdSupplyManage/updateCostPrice
     */
	@POST
	@Path("/updateCostPrice")
	public CostPriceUpdateResponse updateCostPrice(CostPriceUpdateListRequest request)throws BusinessException,SystemException;
	/**
	 * 根据商品编号查询商品的仓库列表-分页查询
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteProdSupplyManage-008
     * @RestRelativeURL RouteProdSupplyManage/queryStandedProdRoutePageSearch
     */
	@POST
	@Path("/queryStandedProdRoutePageSearch")
	public StandedProdRoutePageSearchResponse queryStandedProdRoutePageSearch(StandedProdIdPageSearchRequest request)throws BusinessException,SystemException;
	/**
	 * 查询当前仓库下的产品类目信息-全量
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangzd
	 * @ApiDocMethod
	 * @ApiCode RouteProdSupplyManage-009
     * @RestRelativeURL RouteProdSupplyManage/queryProductCatList
     */
	@POST
	@Path("/queryProductCatList")
	public ProductCatIdListResponse queryProductCatList(RouteProdSupplyRouteIdRequest request)throws BusinessException,SystemException;
	
}
