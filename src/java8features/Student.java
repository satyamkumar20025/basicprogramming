package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {

	int rollno;
	String name;
	/**
	 * @param rollno
	 * @param name
	 */
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	public static void main(String[] agrs)
	{
		List<Student>st = new ArrayList();
		
		Student s1 = new Student(34,"Satyam");
		Student s2 = new Student(37,"ram");
		Student s4 = new Student(36,"monu");
		Student s3 = new Student(32,"mani");
		Student s7 = new Student(23,"kalu");
		Student s6 = new Student(12,"kali");
		Student s9 = new Student(234,"shima");
		Student s8 = new Student(56,"vinit");
		Student s5 = new Student(12,"Sm");
		Student s10 = new Student(56,"Smoo");
		Student s11 = new Student(89,"boos");

		 // Add students to list
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        st.add(s6);
        st.add(s7);
        st.add(s8);
        st.add(s9);
        st.add(s10);
        st.add(s11);


		Collections.sort(st,(a,b)-> b.rollno-a.rollno);
		System.out.println();
		System.out.println("Students desending sorting"+st);
		
	}
}






