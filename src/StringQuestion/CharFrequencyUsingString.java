package StringQuestion;

import java.util.Scanner;

public class CharFrequencyUsingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase and remove spaces for cleaner output
        str = str.replaceAll("\\s", "").toLowerCase();

        // Track visited characters
        String visited = "";

        System.out.println("Character frequencies:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Skip if already counted
            if (visited.indexOf(ch) != -1) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            visited += ch; // Mark as visited
            System.out.println(ch + ": " + count);
        }
    }
}