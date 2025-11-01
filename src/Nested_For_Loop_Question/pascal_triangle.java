package Nested_For_Loop_Question;

import java.util.Scanner;

public class pascal_triangle{
    public static void main(String[] args) {
    	Scanner sc=new Scanner (System.in);
    	System.out.print("Enter the size of pascal pattern: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            // Print leading spaces for alignment
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Binomial coefficient logic
            }

            System.out.println();
        }
    }
}