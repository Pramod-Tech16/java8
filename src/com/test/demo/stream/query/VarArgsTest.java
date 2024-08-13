package com.test.demo.stream.query;

public class VarArgsTest {

	public static void main(String[] args) {
		// callMe1(new String[] { "a", "b", "c" });
		// callMe2("a", "b", "c");
		// You can also do this
		// callMe2(new String[] {"a", "b", "c"});
		int[] x = { 5, 7, 9, 3, 5, 10, 44 };
		int[] y = x.clone();
		System.out.println(x.getClass() != y.getClass());
		
	}

	public static void callMe1(String[] args) {
		System.out.println(args.getClass() == String[].class);
		for (String s : args) {
			System.out.println(s);
		}
	}

	public static void callMe2(String... args) {
		System.out.println(args.getClass() == String[].class);
		for (String s : args) {
			System.out.println(s);
		}

	}

	public static void callMe3(Integer... integers) {
		System.out.println(integers.getClass() == Integer[].class);
	}

	
}
