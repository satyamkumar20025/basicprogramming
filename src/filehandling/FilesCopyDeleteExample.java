package filehandling;

import java.nio.file.*;
import java.io.IOException;

public class FilesCopyDeleteExample {

	

	    public static void main(String[] args) {
	        try {
	            Path source = Paths.get("file1.txt");
	            Path destination = Paths.get("output.txt");

	            // Copy
	            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
	            System.out.println("File copied successfully!");

	            // Delete
	            Files.delete(destination);
	            System.out.println("Backup deleted successfully!");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


