package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="itemInfo")
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String serialNumber;
	
	@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart cart;

	public Item(String serialNumber, Cart cart) {
		super();
		this.serialNumber = serialNumber;
		this.cart = cart;
	}
	
	
	
	

}
