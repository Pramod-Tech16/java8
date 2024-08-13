package com.test.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import java.util.stream.Stream;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private int salary;

	public Employee(int id, String name, String dept, int salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public int getSalary() {
		return salary;
	}

	public static void main(String[] args) {

		List<Employee> empList = Stream.of(
				new Employee(2, "Pramod", "Dev", 70000),
				new Employee(3, "Deepak", "Dev", 100000),
				new Employee(7, "Ram", "Dev", 110000),
				new Employee(9, "Shyam", "Dev", 100000),
				new Employee(6, "Simran", "Test", 80000),
				new Employee(10, "Radha", "Test", 80000),
				new Employee(4, "Madhu", "Test", 80000),
				new Employee(6, "Barkha", "Dev", 40000),
				new Employee(5, "Adam", "devops", 120000))
				.collect(Collectors.toList());

		System.out.println(empList);
		// try with sort also.
		// Collections.sort
		// get highest paid emp from each department
		
	    Comparator<Employee> compcareBySalary =Comparator.comparing(Employee::getSalary);
	Map<String, Optional<Employee>> collect = empList.stream().collect(groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(compcareBySalary))));
	   System.out.println(collect);
	}

}
