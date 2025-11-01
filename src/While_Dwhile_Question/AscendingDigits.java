package While_Dwhile_Question;

import java.util.Scanner;

public class AscendingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean ascending = true;
        int prevDigit = 10;   // larger than any digit (0–9)

        while(num > 0) {
            int currentDigit = num % 10;
            if(currentDigit > prevDigit) {
                ascending = false;
                break;
            }
            prevDigit = currentDigit;
            num /= 10;
        }

        if(ascending)
            System.out.println("Digits are in ascending order.");
        else
            System.out.println("Digits are NOT in ascending order.");
    }
}