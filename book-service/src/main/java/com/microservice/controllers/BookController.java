package com.microservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.model.Book;
import com.microservice.proxy.CambioProxy;
import com.microservice.repositories.BookRepository;

@RestController
@RequestMapping("/book-service")
public class BookController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private BookRepository repository;
	
	@Autowired
	private CambioProxy proxy;
	
	//http://localhost:8100/book-service/14/BRL
	@GetMapping(value = "/{id}/{currency}")
	public Book findBook(@PathVariable("id") Long id, @PathVariable("currency") String currency) {
		var book = repository.findById(id);
		if(book == null) throw new RuntimeException("book not found");
		
		var cambio = proxy.getCambio(book.get().getPrice(), "USD", currency);
		
		var port = environment.getProperty("local.server.port");
		book.get().setEnvironment("book port: " + port + " cambio port: " + cambio.getEnvironment());
		book.get().setPrice(cambio.getConvertedValue());
		return book.get();
	}

}
