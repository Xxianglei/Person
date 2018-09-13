package com.xianglei.crm.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import com.xianglei.crm.pojo.BaseDict;
import com.xianglei.crm.pojo.Customer;
import com.xianglei.crm.pojo.QueryVo;
import com.xianglei.crm.service.BaseDictService;
import com.xianglei.crm.service.CustomerService;
import com.xianglei.crm.utils.Page;

import sun.net.www.content.text.plain;

/**
 * 客户信息请求处理
 * 
 * @author 丽丽超可爱
 *
 */
@Controller
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private BaseDictService dictservice;
	@Autowired
	private CustomerService cus;
	/**
	 * 属性文件抽取
	 */
	// 获取配置文件的值
	@Value("${customer_from_Type}")
	private String customer_from_Type;
	@Value("${customer_industry_Type}")
	private String customer_industry_Type;
	@Value("${customer_level_Type}")
	private String customer_level_Type;

	@RequestMapping("list")
	public String list(Model model, QueryVo vo) {
		if(StringUtils.isNotBlank(vo.getCustName()))
		{
			try {
				vo.setCustName(new String(vo.getCustName().getBytes("ISO-8859-1"),"utf-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/**
		 * 查询来源
		 */
		List<BaseDict> fromType = dictservice.getBaseDicByCode(customer_from_Type);
		List<BaseDict> industryType = dictservice.getBaseDicByCode(customer_industry_Type);
		List<BaseDict> levelType = dictservice.getBaseDicByCode(customer_level_Type);
		/**
		 * 设置数据模型的返回
		 */
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		// 根据查询条件分页查询数据列表
		Page<Customer> customerByQueryVo = cus.getCustomerByQueryVo(vo);
		model.addAttribute("page", customerByQueryVo);
		// 数据回显
		model.addAttribute("custName", vo.getCustName());
		model.addAttribute("CustSource", vo.getCustSource());
		model.addAttribute("CustIndustry", vo.getCustIndustry());
		model.addAttribute("CustLevel", vo.getCustLevel());
		return "customer";

	}

}
