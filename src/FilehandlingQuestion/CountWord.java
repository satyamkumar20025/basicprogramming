package FilehandlingQuestion;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountWord {
	
	
	    public static void main(String[] args) {
	        int count = 0;
	        try {
	            BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
	            String line;

	            while ((line = br.readLine()) != null) {
	                String words[] = line.trim().split("\\s+");
	                count += words.length;
	            }
	            br.close();
	            System.out.println("Total Words: " + count);
	        } catch (Exception e) {
				e.printStackTrace();
	        }
	    }
	}