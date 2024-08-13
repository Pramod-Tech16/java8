package com.test.demo;

interface A{
	void f1();
}
interface B{
	void f2();
}
interface C{
	void f3();
}
public interface Test1 extends A,B,C {

	void f4();
}
class Tets2 implements A,B,C{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
