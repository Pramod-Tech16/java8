package com.test.demo.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;
import java.util.Map.Entry;

public class SortMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("three", 3);
		map.put("seven", 7);
		map.put("nine", 9);
		map.put("four", 4);
		Map<EmployeeEntity, Integer> employeeMap = new TreeMap<>(new Comparator<EmployeeEntity>() {

			@Override
			public int compare(EmployeeEntity o1, EmployeeEntity o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getSalary() - o2.getSalary());
			}
		});
		employeeMap.put(new EmployeeEntity(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0), null);
		employeeMap.put(new EmployeeEntity(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0), 10);
		employeeMap.put(new EmployeeEntity(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0), 20);
		employeeMap.put(new EmployeeEntity(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0), 30);
		employeeMap.put(new EmployeeEntity(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0), 40);
		employeeMap.put(new EmployeeEntity(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0),
				50);
		employeeMap.put(new EmployeeEntity(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0), 60);
		employeeMap.put(new EmployeeEntity(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0), 80);
		employeeMap.put(new EmployeeEntity(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0), 90);
	//	System.out.println(employeeMap);

		// System.out.println(map.entrySet());
		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

//		for (Entry<String, Integer> entry : entries) {
//			System.out.print(entry.getKey() + " " + entry.getValue());
//		}
//        Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				// TODO Auto-generated method stub
//				return o1.getKey().compareTo(o2.getKey());
//			}
//		});
//        System.out.println(entries);

		// Lamda expression for the same map object
		// System.out.println("Before Sorting " +entries);
		// Collections.sort(entries, (o1,o2)->o1.getKey().compareTo(o2.getKey()));
		// System.out.println("After Sorting "+entries);

		// Using Stream API

		// map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		// map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		Stream<Entry<EmployeeEntity, Integer>> sorted = employeeMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(EmployeeEntity::getYearOfJoining)));
				//.forEach(System.out::println);
            System.out.println(sorted.findFirst());
            
            
	}
}
