package com.test.demo;

public interface FuntionalInterfaceTest1 {

	void m2();
	
	static void m3() {
		
	}
	
	default void m() {
		
	}
     static void m5() {
		
	}
     
}

class Impl implements FuntionalInterfaceTest1{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		FuntionalInterfaceTest1.super.m();
	}
	
}
