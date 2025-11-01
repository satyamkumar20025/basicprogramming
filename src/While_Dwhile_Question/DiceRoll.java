package While_Dwhile_Question;
import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        Random rand = new Random();
        int rolls = 0, dice;
        
        do {
            dice = rand.nextInt(6) + 1; // random number between 1 and 6
            rolls++;
            System.out.println("Rolled: " + dice);
        } while (dice != 6);

        System.out.println("It took " + rolls + " rolls to get a 6.");
    }
}