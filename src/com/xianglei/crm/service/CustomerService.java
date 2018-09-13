package com.xianglei.crm.service;

import java.util.List;

import com.xianglei.crm.pojo.Customer;
import com.xianglei.crm.pojo.QueryVo;
import com.xianglei.crm.utils.Page;
/**
 * 客户信息持久化接口
 * @author 丽丽超可爱
 *
 */
public interface CustomerService {
	
	Page<Customer> getCustomerByQueryVo(QueryVo vo);

}
