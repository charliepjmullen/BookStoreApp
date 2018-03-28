package com.patterns.BookStoreApp.Model;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

	@Entity
	@Table(name = "user")
	public class User {
	    private Long id;
	    private String username;
	    private String user_password;
	    private String password_confirm;
	    private String shipping_address;
	    private String payment_details;


	    public User() {
	    	
	    }
	    
	    public User(Long id, String username, String user_password, String password_confirm) {
	    	
	    	this.id= id;
	    	this.username = username;
	    	this.user_password = user_password;
	    	this.password_confirm = password_confirm;

	    }
	    
	    public User(Long id, String username, String user_password, String password_confirm, String shipping_address, String payment_details) {
	    	
	    	this.id= id;
	    	this.username = username;
	    	this.user_password = user_password;
	    	this.password_confirm = password_confirm;
	    	this.shipping_address = shipping_address;
	    	this.payment_details = payment_details;
	    }
	    

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getUser_password() {
	        return user_password;
	    }

	    public void setUser_password(String user_password) {
	        this.user_password = user_password;
	    }

	    @Transient
	    public String getPassword_confirm() {
	        return password_confirm;
	    }

	    public void setPassword_confirm(String password_confirm) {
	        this.password_confirm = password_confirm;
	    }

		public String getShipping_address() {
			return shipping_address;
		}

		public void setShipping_address(String shipping_address) {
			this.shipping_address = shipping_address;
		}

		public String getPayment_details() {
			return payment_details;
		}

		public void setPayment_details(String payment_details) {
			this.payment_details = payment_details;
		}

}