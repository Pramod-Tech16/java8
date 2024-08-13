package com.test.demo.pre.fun;

import java.util.Arrays;
import java.util.List;

public class SupplierFunInTest {

	public static void main(String[] args) {
		// Supplier<String> supplier = ()-> "Hi This is Supplier Funtional Interface
		// Example.......!";
		// System.out.println(supplier.get());

		List<String> list = Arrays.asList();
		// list.stream().findAny().orElseGet(()->"Hi This is Supplier Funtional
		// Interface ");
		System.out.println(list.stream().findAny().orElseGet(() -> "Hi This is Supplier Funtional Interface "));

	}

//	@Override
//	public String get() {
//		return "Hi This Supplier Funtional Interface Example.......!";
//	}

}
