package filehandling;


import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class FileReadExample {

	    public static void main(String[] args) {
	        try {
	            List<String> lines = Files.readAllLines(Paths.get("file1.txt"));
	            for (String line : lines) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


