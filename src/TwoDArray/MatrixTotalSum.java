package TwoDArray;
import java.util.Scanner;

public class MatrixTotalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrix size input
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Matrix input
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = sc.nextInt();

        // Total sum calculation
        int sum = 0;
        for (int[] row : arr)
            for (int val : row)
                sum += val;

        System.out.println("Total sum of matrix: " + sum);
        sc.close();
    }
}