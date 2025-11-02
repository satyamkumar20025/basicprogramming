package StringQuestion;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // अगर lowercase है तो uppercase करो
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            }
            // अगर uppercase है तो lowercase करो
            else if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            }
            else {
                result += ch; // बाकी characters वैसे के वैसे
            }
        }

        System.out.println("Converted string: " + result);
    }
}