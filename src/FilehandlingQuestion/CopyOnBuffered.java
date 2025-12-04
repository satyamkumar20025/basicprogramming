package FilehandlingQuestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyOnBuffered {

	
	    public static void main(String[] args) {
	        try {
	            BufferedReader br = new BufferedReader(new FileReader("example.txt"));
	            BufferedWriter bw = new BufferedWriter(new FileWriter("example1.txt"));

	            String line;
	            while ((line = br.readLine()) != null) {
	                bw.write(line);
	                bw.newLine(); // preserve formatting
	            }
	            
	            br.close();
	            bw.close();
	            System.out.println("Copy Completed!");
	        } catch (Exception e) {
				e.printStackTrace();
	        }
	    }
	}

