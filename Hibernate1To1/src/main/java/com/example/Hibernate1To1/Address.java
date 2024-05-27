package com.example.Hibernate1To1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AddressDetails")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
      private int id;
      private String city;
      
      @OneToOne
      @JoinColumn(name="user_id")
      private User user;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String city, User user) {
		super();
		this.id = id;
		this.city = city;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
      
      
}
