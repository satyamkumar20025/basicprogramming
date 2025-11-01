package While_Dwhile_Question;
import java.util.Random;

public class RandomPrime {
    public static void main(String[] args) {
        Random rand = new Random();
        int attempts = 0;
        int num;

        do {
            num = rand.nextInt(50) + 1; // between 1 and 50
            attempts++;
        } while(!isPrime(num));

        System.out.println("Prime number found: " + num);
        System.out.println("Attempts: " + attempts);
    }

    static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
