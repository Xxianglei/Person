package com.xianglei.crm.mapper;

import java.util.List;

import com.xianglei.crm.pojo.Customer;
import com.xianglei.crm.pojo.QueryVo;
/**
 * 客户信息持久化接口
 * @author 丽丽超可爱
 *
 */
public interface CustomerMapper {
	
	List<Customer> getCustomerByQueryVo(QueryVo vo);
	
	Integer getCountByQueryVo(QueryVo vo);

}
