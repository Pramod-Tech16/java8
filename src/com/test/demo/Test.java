package com.test.demo;

import java.util.Objects;

public class Test {
	
	
	String name;
	

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	/*
	 * public boolean equals(Object obj) { if (this == obj) return true; if (obj ==
	 * null) return false; if (getClass() != obj.getClass()) return false; Test
	 * other = (Test) obj; return Objects.equals(name, other.name); }
	 */

	public static void main(String[] args) {
		System.out.println("Hellooooooooooooo");
		Test t= new Test();
		Test t1= new Test();
		System.out.println(t.equals(t1));
        
	}
}
