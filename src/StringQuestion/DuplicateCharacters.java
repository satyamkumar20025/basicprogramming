package StringQuestion;

import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        String checked = "";

        System.out.println("Duplicate characters:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (checked.indexOf(ch) == -1 && str.indexOf(ch) != str.lastIndexOf(ch)) {
                System.out.println(ch);
                checked += ch;
            }
        }
    }
}