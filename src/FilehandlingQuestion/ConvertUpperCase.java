package FilehandlingQuestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ConvertUpperCase {


    public static void main(String[] args) {
        int count = 0;
        try {

            BufferedReader br = new BufferedReader(new FileReader("example.txt"));

            BufferedWriter bw = new BufferedWriter(new FileWriter("file1.txt"));
            String line;

            while ((line = br.readLine()) != null) {
            
            	bw.write(line.toUpperCase());
            	br.close();
            	bw.close();
            	
            }
            
            System.out.println("Total Words: " + count);
            System.out.println("Conver To Upper Case Words: " +line);

        } catch (Exception e) {
			e.printStackTrace();
        }
    }
}

