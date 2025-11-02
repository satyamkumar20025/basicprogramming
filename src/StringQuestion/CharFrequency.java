package StringQuestion;

import java.util.HashMap;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (char ch : freq.keySet()) {
            System.out.println(ch + ": " + freq.get(ch));
        }
    }
}