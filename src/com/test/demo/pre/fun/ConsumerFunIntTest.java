package com.test.demo.pre.fun;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunIntTest {

	public static void main(String[] args) {
//		Consumer<Integer> consumer=(t)-> 
//        System.out.println("Printing : " +t);
//        consumer.accept(10);

		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6);
		asList.stream().forEach((t) -> System.out.println("Printing : " + t));

	}

}
