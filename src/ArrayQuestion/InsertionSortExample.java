package ArrayQuestion;

import java.util.Scanner;

public class InsertionSortExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: User se array size lo
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: User se array elements lo
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Before sorting print karo
        System.out.println("\nBefore Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Step 4: Insertion Sort Logic
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        // Step 5: After sorting print karo
        System.out.println("\nAfter Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}