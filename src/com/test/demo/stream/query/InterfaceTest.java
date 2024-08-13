package com.test.demo.stream.query;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

interface In1 {
	int a = 10;

	void display();
}

interface In2 {
	void display();
}

interface In3 {
	void display();
}

public class InterfaceTest implements In1, In2, In3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list =new LinkedList<>();
		Queue queue=new PriorityQueue<>();
		Stack stack=new Stack<>();
		In3 in = new InterfaceTest();
		in.display();
		System.out.println(a);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display Method.....");
	}

}
