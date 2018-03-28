package com.patterns.BookStoreApp.Model;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {

	private Long id;
    private String adminname;
    private String admin_password;
    private String admin_passwordConfirm;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAdminname() {
		return adminname;
	}
	
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	
	public String getAdmin_password() {
		return admin_password;
	}
	
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	
	public String getAdmin_passwordConfirm() {
		return admin_passwordConfirm;
	}
	
	public void setAdmin_passwordConfirm(String admin_passwordConfirm) {
		this.admin_passwordConfirm = admin_passwordConfirm;
	}

    

}