package com.test.demo.stream.query;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student("Paul", 11, "Economics", 58.9));
		studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
		studentList.add(new Student("Harish", 13, "History", 83.7));
		studentList.add(new Student("Xiano", 14, "Literature", 71.5));
		studentList.add(new Student("Soumya", 15, "Economics", 57.5));
		studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
		studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
		studentList.add(new Student("Mitshu", 18, "History", 53.5));
		studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
		studentList.add(new Student("Harry", 20, "History", 71.9));

		/*
		 * List<Student> collect = studentList.stream()
		 * .sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(
		 * 3) .collect(Collectors.toList()); System.out.println(collect);
		 */
		Map<String, Double> collect2 = studentList.stream()
				.collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getPercentage)));
		System.out.println(collect2);
		
		//Get average,min,max percentage of a student
	    DoubleSummaryStatistics collect = studentList.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
		System.out.println(collect);
		
		Map<Boolean, List<Student>> collect3 = studentList.stream().collect(Collectors.partitioningBy(student->student.getPercentage()>60.0));

		System.out.println(collect3);
	}
}
