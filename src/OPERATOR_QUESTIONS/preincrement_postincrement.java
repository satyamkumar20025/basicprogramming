package OPERATOR_QUESTIONS;

import java.util.Scanner;

public class preincrement_postincrement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers to see the difference between post-increment and pre-increment: ");
        int n = sc.nextInt(); // for post-increment
        int m = sc.nextInt(); // for pre-increment

        System.out.println("Before post-increment: " + n);
        System.out.println("After post-increment: " + (n++)); // prints n, then increments
        System.out.println("Now n is: " + n);

        System.out.println("Before pre-increment: " + m);
        System.out.println("After pre-increment: " + (++m)); // increments first, then prints
    }
}