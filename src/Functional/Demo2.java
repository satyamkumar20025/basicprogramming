package Functional;

import java.util.function.Function;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer>function1 = x -> 2 * x;
		Function<Integer,Integer>function2 = x -> x*x*x;
		Function<String,String>Identiyfunction3 = Function.identity();

		System.out.println(function1.andThen(function2).apply(3));
		System.out.println(function2.andThen(function2).apply(3));
		System.out.println(function2.andThen(function2).apply(3));
		System.out.println(function1.andThen(function1).apply(3));
        System.out.println(Identiyfunction3.apply("Satyam Don"));

	}

}
