package com.patterns.BookStoreApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patterns.BookStoreApp.Model.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
