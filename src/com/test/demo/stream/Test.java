package com.test.demo.stream;

class A{
	public void m1() {
		System.out.println("parent m1");
	}
}
class Test extends A{
	
	public void m1() {
		System.out.println("child M1");
	}

	public static void main(String[] args) {
          A a=new Test();
          a.m1();
	}
}
