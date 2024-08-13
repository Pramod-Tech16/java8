package com.test.demo.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ForEachDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("John");
		list.add("Stark");
		list.add("Mark");
		list.add("Klassen");
		list.add("David");
		list.add("Wood");
		//applying filter
		for (String names : list) {
			if(names.startsWith("M")) {
				System.out.println(names);
			}
		}
		list.stream().filter(t->t.startsWith("M")).forEach(t -> System.out.println(t));

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		//map.forEach((key, value) -> System.out.println("Key : " + key + " " + "Value : " + value));
	    map.entrySet().stream().filter(t->t.getKey()%2==0).forEach(obj->System.out.println(obj));
	}

}
