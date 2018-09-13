package com.xianglei.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xianglei.crm.mapper.CustomerMapper;
import com.xianglei.crm.pojo.Customer;
import com.xianglei.crm.pojo.QueryVo;
import com.xianglei.crm.service.CustomerService;
import com.xianglei.crm.utils.Page;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
   
	public Page<Customer> getCustomerByQueryVo(QueryVo vo) {
	         vo.setStart((vo.getPage()-1)*vo.getRows());
			// 查询每页的列表
			List<Customer> list = customerMapper.getCustomerByQueryVo(vo);
			// 查询总记录数
			Integer total = customerMapper.getCountByQueryVo(vo);
			// 包装分页数据
			Page<Customer> page=new Page<Customer>(total,vo.getPage(),vo.getRows(),list);
		// TODO Auto-generated method stub
			
		return page;
	}



	

}
