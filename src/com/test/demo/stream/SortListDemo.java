package com.test.demo.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.test.demo.stream.query.Employee;

public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(8);
		list.add(9);
		list.add(3);
		list.add(1);
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//		Collections.reverse(list);
//		System.out.println(list);

		// list.stream().sorted().forEach(t->System.out.println(t)); //ascending order
		//list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t));// descending order

		EmployeeDataBase dataBase = new EmployeeDataBase();
		List<EmployeeEntity> empList = dataBase.getEmpList();
	//	Collections.sort(empList, new MyComparator());
		//Collections.sort(empList, (o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
		//System.out.println(empList);
		// empList.stream().sorted().forEach(t->System.out.println(t));
		//empList.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).forEach(System.out::println);//ascending order
		//empList.stream().sorted(Comparator.comparing()).forEach(System.out::println);
		empList.stream().sorted(Comparator.comparing(EmployeeEntity::getName)).forEach(System.out::println);
		
		
	}

}

