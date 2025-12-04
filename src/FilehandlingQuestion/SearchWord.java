package FilehandlingQuestion;

import java.io.*;

public class SearchWord {
    public static void main(String[] args) {
        String word = "Java";
        int lineNo = 0;
        boolean found = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader("example1.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineNo++;
                if (line.contains("java")) {
                    found = true;
                    System.out.println("Found at Line: " + lineNo);
                }
            }
            br.close();

            if (!found) System.out.println("Word Not Found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}