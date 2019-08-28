package com.Bonsch.demoBooks.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bonsch.demoBooks.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	Optional<Book> findByAuthor (String author);
	List<Book> findByName (String name);
	Optional<Book> findByPrice (float price);
	
}