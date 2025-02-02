//many to one tables used customer and ordertable

package com.tap.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="OrderTable")
public class OrderTable {
	
	@Id
	@Column(name = "oid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oid;
	@Column(name = "itemname")
	private String itemName;
	@Column(name = "price")
	private int price;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customer_info")
	private Customer customer;
	
	
	/**
	 * @return the oid
	 */
	public int getOid() {
		return oid;
	}
	/**
	 * @param oid the oid to set
	 */
	public void setOid(int oid) {
		this.oid = oid;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	public OrderTable(String itemName, int price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}
	public OrderTable() {
		super();
	}
	
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public OrderTable(String itemName, int price, Customer customer) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "OrderTable [oid=" + oid + ", itemName=" + itemName + ", price=" + price + "]";
	}
	

}
