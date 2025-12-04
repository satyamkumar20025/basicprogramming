package FilehandlingQuestion;

import java.io.*;

public class ReplaceWord {

	
	    public static void main(String[] args) {
	        String oldWord = "Java";
	        String newWord = "Python";

	        try {
	            BufferedReader br = new BufferedReader(new FileReader("example1.txt"));
	            BufferedWriter bw = new BufferedWriter(new FileWriter("file1.txt"));

	            String line;
	            while ((line = br.readLine()) != null) {
	                line = line.replace("java", "paython");
	                bw.write(line);
	                bw.newLine();
	            }
	            br.close();
	            bw.close();
	            System.out.println("Word Replaced Successfully!");
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}

