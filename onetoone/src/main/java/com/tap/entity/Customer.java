package com.tap.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@Column(name = "cid")
	private int cid;
	
	@Column(name = "name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private CustomerDetails cd; //calling customer details

	//we canont able to write @ManyToOne like here we write @onetoone in both
	//customer and customer details tables because many customers are not mapped to one order 
	//we have to write @onetomany here
	@OneToMany(mappedBy = "customer" , cascade = CascadeType.ALL )
    private List<OrderTable>orders;
	
	public Customer(int cid, String name, CustomerDetails cd) {
		super();
		this.cid = cid;
		this.name = name;
		this.cd = cd;
	}


	public Customer() {
		super();
	}


	public Customer(int cid, String name) {
		// TODO Auto-generated constructor 
		this.cid = cid;
		this.name = name;

	}


	/**
	 * @return the cid
	 */
	public int getCid() {
		return cid;
	}


	/**
	 * @param cid the cid to set
	 */
	public void setCid(int cid) {
		this.cid = cid;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the cd
	 */
	public CustomerDetails getCd() {
		return cd;
	}


	/**
	 * @param cd the cd to set
	 */
	public void setCd(CustomerDetails cd) {
		this.cd = cd;
	}

	/**
	 * @return the orders
	 */
	public List<OrderTable> getOrders() {
		return orders;
	}


	/**
	 * @param orders the orders to set
	 */
	public void setOrders(List<OrderTable> orders) {
		this.orders = orders;
	}


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", cd=" + cd + "]";
	}
	

}
