package filehandling;


import java.nio.file.*;
import java.io.IOException;
import java.util.Arrays;

public class FilesWriteExample {

	    public static void main(String[] args) {
	        try {
	            Path path = Paths.get("file1.txt");
	            Files.write(path, Arrays.asList("Line 1", "Line 2", "Line 3"));
	            System.out.println("Data written using NIO Files API!");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


