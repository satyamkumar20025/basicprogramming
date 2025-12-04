package FilehandlingQuestion;

import java.io.FileWriter;
import java.util.Scanner;

public class Appendfile {
	
	    public static void main(String[] args) {
	        try {
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter text to write:");
	            String data = sc.nextLine();

	            FileWriter fw = new FileWriter("file1.txt"); // overwrite mode
	            fw.write(data);
	            fw.close();
	            System.out.println("Writing Complete!");
	        } catch (Exception e) {
				e.printStackTrace();
	        }
	    }
	}

