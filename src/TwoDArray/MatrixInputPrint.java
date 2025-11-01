package TwoDArray;

/*
 * public class MatrixInputPrint {
 * 
 * }
 */
import java.util.Scanner;

public class MatrixInputPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrix size input
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // User input
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = sc.nextInt();

        // Print matrix
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
