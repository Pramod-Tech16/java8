package com.test.demo.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public static void main(String[] args) {

		System.out.println(new BookService().getBooksInSort());
	}

//	@Override
//	public int compare(Book o1, Book o2) {
//		// TODO Auto-generated method stub
//		return o1.getName().compareTo(o2.getName());
//	}
//});

	public List<Book> getBooksInSort() {
		List<Book> books = new BookDao().getBooks();
		Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));

		return books;
	}

	/*
	 * @Override public int compare(Book o1, Book o2) { // TODO Auto-generated
	 * method stub return o1.getName().compareTo(o2.getName()); }
	 */
}
