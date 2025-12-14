package MethodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void print(String s) {
		System.out.println(s);
	}
	private static int hello() {
		return 1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>student3=Arrays.asList("satyam","vivec","ram");
		//Lambda expression
		student3.forEach(x->System.out.println(x));
		///Method Invoking 
		System.out.println(hello());
		
		List<String>student1=Arrays.asList("satyam","vivec","ram");
		////Method Reference
		student1.forEach(Demo::print);
		
		
		//Lambda expression
		List<String>names=Arrays.asList("satyam","vivec","ram");
	    List<Student>student4 = names.stream().map(x-> new Student(x)).collect(Collectors.toList());
	
	
	////Constructoe Reference
	List<String>names1=Arrays.asList("satyam","vivec","ram");
	List<Student>student2 = names1.stream().map(Student::new).collect(Collectors.toList());

	}

}
