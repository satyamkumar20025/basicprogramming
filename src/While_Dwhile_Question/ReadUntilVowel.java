package While_Dwhile_Question;
import java.util.Scanner;

public class ReadUntilVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.print("Enter a character: ");
            ch = sc.next().charAt(0);
        } while (!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'));
        
        System.out.println("You entered a vowel: " + ch);
    }
}


