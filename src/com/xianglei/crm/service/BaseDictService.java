package com.xianglei.crm.service;
import java.util.List;

import com.xianglei.crm.pojo.*;


/**
 * 数据字典业务逻辑接口
 * @author 丽丽超可爱
 *
 */
public interface BaseDictService {
	/**
	 * 根据字典编码查询字典列表
	 * @param code
	 * @return
	 */
	List<BaseDict> getBaseDicByCode(String code);

}
