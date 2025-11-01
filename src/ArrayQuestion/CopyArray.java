package ArrayQuestion;


import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] original = new int[n];
        int[] copy = new int[n];

        // Input elements into original array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }

        // Copy elements to new array
        for (int i = 0; i < n; i++) {
            copy[i] = original[i];
        }

        // Print copied array
        System.out.println("Copied array elements:");
        for (int num : copy) {
            System.out.println(num);
        }

        sc.close();
    }
}