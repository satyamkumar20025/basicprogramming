package FilehandlingQuestion;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		try {
		
			FileReader reader = new FileReader("example.txt");
			
	
			int ch;
			

			while((ch=reader.read())!=-1) {
	
				System.out.println((char)ch);
			
			}
			
			reader.close();
			
			}catch(IOException e) {
				System.out.println("A error occurred");
				e.printStackTrace();
			}
			
		}
	}

