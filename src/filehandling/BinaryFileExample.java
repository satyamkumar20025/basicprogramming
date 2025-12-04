package filehandling;


import java.io.*;

public class BinaryFileExample {
    public static void main(String[] args) {
        
    	try (FileInputStream fis = new FileInputStream("C:\\Users\\hp\\OneDrive\\Pictures\\Saved Pictures\\2326482.jpg");
             FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\OneDrive\\Pictures\\Saved Pictures\\2326482.pgs")) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
            	System.out.println(byteData);
                fos.write(byteData);
            }
            System.out.println("Binary file copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}