package com.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
