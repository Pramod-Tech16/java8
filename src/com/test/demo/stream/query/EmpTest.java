package com.test.demo.stream.query;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

interface A {
	int size();
}

interface B extends A {
	int size();
}

interface C extends A, B {

	@Override
	default int size() {
		// TODO Auto-generated method stub
		return 5;
	}

	
}

public class EmpTest {

	public static void main(String[] args) {
		Map<String, String> books = new HashMap<>();
		C c=new C() {

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return C.super.size();
			}
			
			
			
			
			
			
					};
		// key is ISBN number and value is title
		books.put("978-0201633610", "Design patterns : elements of reusable object-oriented software");
		books.put("978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
		books.put("978-0134685991", "Effective Java");
		// get the ISBN for Effective Java title
		Optional<String> first = books.entrySet().stream().filter(e -> "Effective Java".equals(e.getValue()))
				.map(Map.Entry::getKey).findFirst();
		System.out.println(first);

		Optional<String> optionalValue = Optional.of(null);
		if (optionalValue.isEmpty()) {
			System.out.println(optionalValue.get());
		}

		else {
			System.out.println("Null value is present ");
		}

	}
}
