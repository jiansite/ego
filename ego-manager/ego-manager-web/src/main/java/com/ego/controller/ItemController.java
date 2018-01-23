package com.ego.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ego.service.ItemService;
import com.manager.pojo.Titem;

/**
 * Item Controller
 * @author Jester
 *
 */
@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public Titem selectByPrimaryKey(@PathVariable Long itemId) {
		Titem item=itemService.selectByPrimaryKey(itemId);
		return item;
	}

}
