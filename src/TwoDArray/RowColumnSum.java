package TwoDArray;

/*
 * public class RowColumnSum {
 * 
 * }
 */
import java.util.Scanner;

public class RowColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = sc.nextInt();

        // Row-wise sum
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++)
                rowSum += arr[i][j];
            System.out.println("Row " + i + " sum: " + rowSum);
        }

        // Column-wise sum
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++)
                colSum += arr[i][j];
            System.out.println("Column " + j + " sum: " + colSum);
        }

        sc.close();
    }
}