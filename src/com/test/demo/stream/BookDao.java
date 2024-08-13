package com.test.demo.stream;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(1, "Java", 3));
		books.add(new Book(3, "Cloud", 4));
		books.add(new Book(4, "Design Pattern", 5));
		books.add(new Book(6, "ABC", 6));
		books.add(new Book(8, "Web Service", 7));
		return books;
	}

}
