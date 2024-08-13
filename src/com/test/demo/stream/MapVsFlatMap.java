package com.test.demo.stream;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {

		CustomerDataBase dataBase = new CustomerDataBase();
		List<Customer> list = dataBase.getAll();
		// List<Customer> convert into List<String> ->Data Transformation
		// mapping : customer -> customer.getEmail()
		// customer -> customer.getEmail() one to one mapping
		List<String> collect = list.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		// System.out.println(collect);
		// customer -> customer.getPhoneNumbers() one to many mapping
		List<List<String>> collectMobiles = list.stream().map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());
		//System.out.println(collectMobiles);

		// customer -> customer.getPhoneNumbers() one to many mapping
		List<String> collect2 = list.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println(collect2);
	}

}
