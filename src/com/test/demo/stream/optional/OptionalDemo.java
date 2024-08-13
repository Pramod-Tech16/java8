package com.test.demo.stream.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class OptionalDemo {

	public static void main(String[] args) throws Exception {
		Customer customer = new Customer(101, "john", null, Arrays.asList("397937955", "21654725"));
		// empty
		// of
		// ofNullable

		Optional<Object> emptyOptional = Optional.empty();
		// System.out.println(emptyOptional);

		String customerEmail = customer.getEmail();
		// System.out.println(customerEmail);

		Optional<String> emailOptional = Optional.ofNullable(customer.getEmail());
		// System.out.println(emailOptional);

		Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
		if (emailOptional2.isPresent()) {
			System.out.println(emailOptional2.get());
		}
		System.out.println(emailOptional2.orElse("default@email.com"));

		// System.out.println(emailOptional2.orElseThrow(()->new
		// IllegalArgumentException("email not present")));

		 System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(()->"default email..."));

		 getCustomerByEmailId("pqr");
	}
	
	  public static Customer getCustomerByEmailId(String email) throws Exception {
		  CustomerDataBase customerDataBase=new CustomerDataBase();
	        List<Customer> customers = customerDataBase.getAll();
	       return customers.stream()
	                .filter(customer -> customer.getEmail().equals(email))
	                .findAny().orElseThrow(()->new Exception("no customer present with this email id"));

	    }
}
