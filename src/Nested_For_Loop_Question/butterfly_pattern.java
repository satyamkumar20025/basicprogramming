package Nested_For_Loop_Question;

import java.util.Scanner;

public class butterfly_pattern {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Ener the size of pattern:");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces between wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces between wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}