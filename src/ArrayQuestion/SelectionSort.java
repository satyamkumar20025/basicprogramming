package ArrayQuestion;

public class SelectionSort {

	    // Method for Selection Sort
	    void selectionSort(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            int minIndex = i;

	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            // Swap smallest with first unsorted element
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }

	    // Method to print array
	    void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    // Main method (non-static call)
	    public static void main(String[] args) {
	        SelectionSort s = new SelectionSort(); // object banaya

	        int[] arr = {64, 25, 12, 22, 11};

	        System.out.println("Before sorting:");
	        s.printArray(arr);

	        s.selectionSort(arr); // object ke through call

	        System.out.println("After sorting:");
	        s.printArray(arr);
	    }
	
}
