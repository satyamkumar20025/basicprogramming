package While_Dwhile_Question;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, largest = Integer.MIN_VALUE;

        do {
            System.out.print("Enter a number (-1 to stop): ");
            num = sc.nextInt();
            if (num != -1 && num > largest) {
                largest = num;
            }
        } while (num != -1);

        System.out.println("Largest number entered: " + largest);
    }
}


