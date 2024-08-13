package com.test.demo;

import java.util.HashMap;
import java.util.Map;

public class TestInterface<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map= new HashMap<>();
           map.put("2", "pk");
	}

	void test(InterfaceTest<? super T> action) {

	}

}
