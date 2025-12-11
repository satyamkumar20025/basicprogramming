package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) {
        Predicate<String> startsWithLetter = x -> x.toLowerCase().charAt(0) == 's';
        Predicate<String> endsWithLetter = x -> x.toLowerCase().charAt(x.length() - 1) == 'y';
        Predicate<String> pr = Predicate.isEqual("satyam");

        System.out.println(pr.test("satyam")); 

        List<String> numbers = new ArrayList<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");

        List<String> digit = new ArrayList<>();
        digit.add("1");
        digit.add("2");
        digit.add("3");

        // Functional style printing
        IntStream.range(0, numbers.size())
                 .forEach(i -> System.out.println(numbers.get(i) + " " + digit.get(i)));
    }
}