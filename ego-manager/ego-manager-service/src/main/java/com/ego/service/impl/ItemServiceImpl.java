package com.ego.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ego.service.ItemService;
import com.manager.mapping.TitemMapper;
import com.manager.pojo.Titem;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TitemMapper itemMapper;
	
	@Override
	public Titem selectByPrimaryKey(Long itemId) {
		return itemMapper.selectByPrimaryKey(itemId);
	}
	
}
