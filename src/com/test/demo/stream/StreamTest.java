/*
 * package com.test.demo.stream;
 * 
 * import java.util.ArrayList; import java.util.Collections; import
 * java.util.Comparator; import java.util.List;
 * 
 * public class StreamTest {
 * 
 * public static void main(String[] args) {
 * 
 * List<Employee> empList=new ArrayList<>(); Employee employee1=new Employee(1,
 * "Pramod", "abc", "IT", 100000); Employee employee2=new Employee(2, "Deepak",
 * "xyz", "Hardware", 50000); Employee employee3=new Employee(3, "simran",
 * "cng", "IT", 80000); Employee employee4=new Employee(4, "barkha", "bng",
 * "Hardware", 40000); Employee employee5=new Employee(5, "z", "hyd",
 * "Photo Grapher", 30000); empList.add(employee1); empList.add(employee2);
 * empList.add(employee3); empList.add(employee4); empList.add(employee5);
 * System.out.println("Before Sorting : " +empList);
 * 
 * Collections.sort(empList, new Comparator<Employee>() {
 * 
 * @Override public int compare(Employee o1, Employee o2) { // TODO
 * Auto-generated method stub return o1.getSalary()- o2.getSalary(); } });
 * 
 * 
 * Collections.sort(empList, (o1, o2) ->o1.getSalary() -o2.getSalary());
 * System.out.println("After Sorting :"+empList);
 * 
 * //empList.stream().sorted((o1, o2) ->o1.getSalary()
 * -o2.getSalary()).forEach(System.out::println);
 * empList.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(
 * System.out::println); //System.out.println("After Sorting :"+empList);
 * 
 * }
 * 
 * }
 */