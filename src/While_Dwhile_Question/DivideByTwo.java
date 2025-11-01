package While_Dwhile_Question;

import java.util.Scanner;

public class DivideByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        while(num >= 1) {
            num = num / 2;
            count++;
        }

        System.out.println("Total divisions: " + count);
    }
}
