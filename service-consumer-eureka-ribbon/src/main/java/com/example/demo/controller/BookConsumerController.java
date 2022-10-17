package com.example.demo.controller;

import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class BookConsumerController {
	@Autowired
	@Qualifier("restTemplate")
	private RestTemplate restTemplate;
	
	@GetMapping("/get-book/{id}")
	public Book getBookById( @PathVariable ("id")int id) {
		Book book= restTemplate.getForObject("http://book-service/book/" +id, Book.class);
		return book;
	}

}
