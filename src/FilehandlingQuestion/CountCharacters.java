package FilehandlingQuestion;


import java.io.FileReader;

public class CountCharacters {
    public static void main(String[] args) {
        int count = 0;
        try {
            FileReader fr = new FileReader("file1.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                if (ch != ' ') count++; // ignoring spaces
            }
            fr.close();
            System.out.println("Total Characters: " + count);
        } catch (Exception e) {
			e.printStackTrace();
        }
    }
}