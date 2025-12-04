package FilehandlingQuestion;

import java.io.*;

public class CountLinesParagraphs {
    public static void main(String[] args) {
        int lineCount = 0, paraCount = 1;
        try {
            BufferedReader br = new BufferedReader(new FileReader("example1.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                if (line.trim().isEmpty()) paraCount++;
            }

            br.close();
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Paragraphs: " + paraCount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}