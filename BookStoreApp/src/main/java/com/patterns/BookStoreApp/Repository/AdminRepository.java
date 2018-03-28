package com.patterns.BookStoreApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patterns.BookStoreApp.Model.Admin;



@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{

}
