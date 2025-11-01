package While_Dwhile_Question;
public class DivisibleNumber {
    public static void main(String[] args) {
        int num = 1001;

        while (!(num % 37 == 0 && num % 73 == 0)) {
            num++;
        }

        System.out.println("First number > 1000 divisible by 37 and 73 is: " + num);
    }
}