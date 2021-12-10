package com.springbootrsjpasample.springbootrsjpasample.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootrsjpasample.springbootrsjpasample.order.entity.ItemOrder;
@Repository
public interface ItemOrderRepository extends JpaRepository<ItemOrder, Integer> {

}
