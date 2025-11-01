package ArrayQuestion;

//public class BubbleSort {

	
	import java.util.Scanner;

	public class BubbleSort{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Step 1: Input array size
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        // Step 2: Input array elements
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Step 3: Bubble Sort logic
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j+1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        // Step 4: Print sorted array
	        System.out.println("Sorted array in ascending order:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        sc.close();
	    }
	}

