package Functional;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,String>function1 = s -> s.toUpperCase();
		Function<String,String>function2 = s -> s.substring(0,3);
		
		System.out.println(function1.andThen(function2).apply("satyam"));

	}

}
