package com.springbootrsjpasample.springbootrsjpasample.order.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springbootrsjpasample.springbootrsjpasample.order.entity.ItemOrder;
import com.springbootrsjpasample.springbootrsjpasample.order.service.ItemOrderService;

@RestController
@RequestMapping("/order")
public class ItemOrderController {
	@Autowired
	ItemOrderService itemOrderService;

	@PostMapping("/orders")
	public ItemOrder saveOrder(@RequestBody ItemOrder itemOrder) {
		System.out.println(itemOrder.getItemCompany()+" >>>>"+itemOrder.getItemName());
		itemOrderService.saveOrUpdate(itemOrder);
		
		return itemOrder;
	}

}
