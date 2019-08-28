package com.Bonsch.demoBooks.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bonsch.demoBooks.model.Book;
import com.Bonsch.demoBooks.repository.BookRepository;

@Service
public class BookService  {
	
	@Autowired
	private BookRepository bookRepository; 
	
	
	public List<Book> getBooksByAvrage( float  price , float price2) {
		return null;
		
		
	
	}
	

}
