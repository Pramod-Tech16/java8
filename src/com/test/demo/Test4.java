package com.test.demo;

import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("John", "Mary", "Bob");
		System.out.println(names);
		names.forEach(String::toString);
		System.out.print(names);
	}
}
