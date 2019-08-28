package com.Bonsch.demoBooks.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Book {

	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private long id ;
	 @NotNull
	 private String isbn;
	 @NotNull
	 private String name ; 
	 @NotNull
	 private float price ; 
	@NotNull
	 private boolean availability ; 
	@NotBlank
	 private String author ;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(long id, String isbn, String name, float price, boolean availability, String author) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.name = name;
		this.price = price;
		this.availability = availability;
		this.author = author;
	}
	public Book() {
		super();
	}
	
	
}
