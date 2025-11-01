package While_Dwhile_Question;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double sum = 0;
        int i = 1;
        while(i <= n) {
            if(i % 2 == 0) {
                sum -= 1.0 / i;
            } else {
                sum += 1.0 / i;
            }
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
