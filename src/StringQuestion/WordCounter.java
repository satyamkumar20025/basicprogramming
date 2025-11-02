package StringQuestion;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();

        int count = 0;

        if (str.length() == 0) {
            count = 0;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            count++; // आखिरी शब्द के लिए
        }

        System.out.println("Total words: " + count);
    }
}