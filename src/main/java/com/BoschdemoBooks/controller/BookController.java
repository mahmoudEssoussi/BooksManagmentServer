package com.BoschdemoBooks.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.PostPersist;
import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Bonsch.demoBooks.Service.BookService;
import com.Bonsch.demoBooks.model.Book;
import com.Bonsch.demoBooks.repository.BookRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*", maxAge = 3600)
@RequestMapping("/book")

public class BookController {
	
	

	@Autowired
	BookRepository bookRepository;
	

	
	
	@PostMapping("/add/")
    public String addUser(@Valid @RequestBody Book book) {
				bookRepository.save(book);
        return "validee";
    }
	
	@PostMapping("/find/")
    public Optional<Book> findBook( @RequestBody long id) {
				
        return bookRepository.findById(id);
    }
	
	@PostMapping("/remove/")
    public void removeBook( @RequestBody long id) {
				
         bookRepository.deleteById(id);
    }
	
	@GetMapping("/findAll/")
    public List<Book> findAll( ) {
				
        return bookRepository.findAll();
    }
	
	@PostMapping("/update/{id}")
    public String update( @RequestBody Book book , @PathVariable(name= "id") long id) {
				Book b = new Book();
				
				b=bookRepository.getOne(id);
					b=book;
					b.setId(id);
        		bookRepository.save(b);
        		
        		  return"valideee";
    }
	
	
	@GetMapping("/findByPrice/{price1}/{price2}")
    public List<Book> findfiltred( @PathVariable(name= "price1") float price1 , @PathVariable( name="price2") float price2 ) {
				
		List<Book> AllBooks = new ArrayList<Book>() ;
		List<Book> BooksFiltred = new ArrayList<Book>() ;
		AllBooks = bookRepository.findAll();
		
		
		for (Book book : AllBooks) {
			if (  book.getPrice()< price1 && book.getPrice()> price2 ||  book.getPrice()> price1 && book.getPrice() < price2  ) {
				BooksFiltred.add(book);
			}
		}
		
		return BooksFiltred;
    }
	
	@GetMapping("/findByAuthor/{author}")
    public List<Book> findByAuthor( @PathVariable(name= "author") String author ) {
			
		List<Book> AllBooks = new ArrayList<Book>() ;
		List<Book> BooksFiltred = new ArrayList<Book>() ;
		AllBooks = bookRepository.findAll();
		
		
		for (Book book : AllBooks) {
			if (  book.getAuthor().equalsIgnoreCase(author)) {
				BooksFiltred.add(book);
			}
		}
		
		return BooksFiltred;
	
    }
	@GetMapping("/findByName/{name}")
    public List<Book> findByName( @PathVariable(name= "name") String name ) {

		
		return bookRepository.findByName(name);
	
    }
	
	
	


}
