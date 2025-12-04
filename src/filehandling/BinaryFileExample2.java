package filehandling;

import java.io.*;

public class BinaryFileExample2 {
    public static void main(String[] args) {
        // Source file (input)
        String sourcePath = "C:\\Users\\hp\\Downloads\\Sparkle Ringtone _ Your Name-Downringtone.com.mp3";
        // Destination file (output)
        String destPath = "C:\\Users\\hp\\Downloads\\CopiedSparkleRingtone.mp3";

        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPath)) {

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