package com.xianglei.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xianglei.crm.mapper.BaseDictMapper;
import com.xianglei.crm.pojo.BaseDict;
import com.xianglei.crm.service.BaseDictService;

@Service
public class BaseDictServiceImpl implements BaseDictService {
	@Autowired
	private BaseDictMapper baseDictMapper;

	public List<BaseDict> getBaseDicByCode(String code) {
		List<BaseDict> baseDicByCode = baseDictMapper.getBaseDicByCode(code);
		return baseDicByCode;
	}

}
