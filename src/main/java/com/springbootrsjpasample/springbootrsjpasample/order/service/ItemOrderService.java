package com.springbootrsjpasample.springbootrsjpasample.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrsjpasample.springbootrsjpasample.order.entity.ItemOrder;
import com.springbootrsjpasample.springbootrsjpasample.order.repository.ItemOrderRepository;

@Service
public class ItemOrderService {
	@Autowired
	ItemOrderRepository itemOrderRepository;
public void saveOrUpdate(ItemOrder itemOrder) {
	System.out.println(itemOrder.getItemCompany()+" >>>>"+itemOrder.getItemName());
	itemOrderRepository.save(itemOrder);
	
	}

}
