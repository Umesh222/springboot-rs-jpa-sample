package com.springbootrsjpasample.springbootrsjpasample.order.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Item_Order")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class ItemOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(columnDefinition = "serial")
	private int orderId;
	private String itemName;
	private String itemCompany;
	private double itemPrice;

	public ItemOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemOrder(int orderId, String itemName, String itemCompany, double itemPrice) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.itemCompany = itemCompany;
		this.itemPrice = itemPrice;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCompany() {
		return itemCompany;
	}

	public void setItemCompany(String itemCompany) {
		this.itemCompany = itemCompany;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

}
