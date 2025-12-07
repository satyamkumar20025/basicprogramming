package filehandling;

import java.io.File;

public class RenamefileExample {


	    public static void main(String[] args) {
	        File oldFile = new File("example1.txt");
	        File newFile = new File("Don.txt");

	        if (oldFile.renameTo(newFile)) {
	            System.out.println("File renamed successfully!");
	        } else {
	            System.out.println("Rename failed.");
	        }
	    }
	}










