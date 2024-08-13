package com.test.demo;

import java.util.function.Predicate;

public class PridicateTest implements Predicate<Integer> {

	public static void main(String[] args) {
		PridicateTest test=new PridicateTest();
		System.out.println(test.test(2));
		
		
		
	}

	@Override
	public boolean test(Integer t) {
	  if(t%2==0) {
		  return true;
	  }
	  return false;
	}

}
