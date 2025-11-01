package ArrayQuestion;

import java.util.*;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr); // Sort the array

        System.out.println("Second smallest: " + arr[1]);
        System.out.println("Second largest: " + arr[n - 2]);

        sc.close();
    }
}
