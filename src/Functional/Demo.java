package Functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        // Function to get length of string
        Function<String, Integer> function1 = x -> x.length();

        
        Function<String, String> function2 = s -> s.length() >= 3 ? s.substring(0, 3) : s;

        
        Function<List<Student>, List<Student>> studentsWithVipAsPrefix = li -> {
            List<Student> result = new ArrayList<>();
            for (Student s : li) {
                if (function2.apply(s.getName()).equalsIgnoreCase("VIP")) {
                    result.add(s);
                }
            }
            return result;
        };

        // Create students
        Student s1 = new Student(34, "Satyam");
        Student s2 = new Student(37, "ram");
        Student s3 = new Student(32, "mani");
        Student s4 = new Student(36, "monu");
        Student s5 = new Student(12, "VIPsm");   
        Student s6 = new Student(12, "kali");
        Student s7 = new Student(23, "kalu");
        Student s8 = new Student(56, "VIPvinit"); 
        Student s9 = new Student(234, "shima");
        Student s10 = new Student(56, "Smoo");
        Student s11 = new Student(89, "boos");

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);

        // Apply filter
        List<Student> filteredStudents = studentsWithVipAsPrefix.apply(students);

        // Print result
        System.out.println(filteredStudents);
    }

    public static class Student {
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + "]";
        }

        public int getId() { return id; }
        public String getName() { return name; }
    }
}