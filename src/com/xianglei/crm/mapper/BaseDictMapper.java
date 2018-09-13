package com.xianglei.crm.mapper;
import java.util.List;

import com.xianglei.crm.pojo.*;


/**
 * 数据字典持久化模型
 * @author 丽丽超可爱
 *
 */
public interface BaseDictMapper {
	/**
	 * 根据字典编码查询字典列表
	 * @param code
	 * @return
	 */
	List<BaseDict> getBaseDicByCode(String code);

}
