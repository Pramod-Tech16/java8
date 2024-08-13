package com.test.demo;

public class Test2 {

	public static void main(String[] args) {
		int n = 10;
		try {
			System.out.println(n / 0);
		} catch (ArithmeticException e1) {
			System.out.println("Arithmetic Exp" + e1);
		}

		catch (Exception e) {
			System.out.println("Catch block " + e);
		}
	}
}
