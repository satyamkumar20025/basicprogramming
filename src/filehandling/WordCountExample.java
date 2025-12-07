package filehandling;


import java.io.*;
import java.util.*;

public class WordCountExample {

	

	    public static void main(String[] args) {
	        try (Scanner sc = new Scanner(new File("File1.txt"))) {
	            int lines = 0, words = 0, chars = 0;
	            while (sc.hasNextLine()) {
	                String line = sc.nextLine();
	                lines++;
	                words += line.split("\\s+").length;
	                chars += line.length();
	            }
	            System.out.println("Lines: " + lines);
	            System.out.println("Words: " + words);
	            System.out.println("Characters: " + chars);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


