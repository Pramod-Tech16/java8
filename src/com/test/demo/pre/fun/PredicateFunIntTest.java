package com.test.demo.pre.fun;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunIntTest {

	public static void main(String[] args) {
//		Predicate<Integer> predicate= t-> t%2==0;
//		System.out.println(predicate.test(7));
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6);
		asList.stream().filter(t->t%2==0).forEach(t->System.out.println("Even Number : "+t));
		
	}

//	@Override
//	public boolean test(Integer t) {
//		if (t % 2 == 0) {
//			return true;
//		}
//		return false;
//	}

}
