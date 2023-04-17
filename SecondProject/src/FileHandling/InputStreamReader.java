package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class InputStreamReader {

	public static void main(String[] args) {
		char [] arr = new char [100];
		
			try {
				FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\Desktop\\FilesFolder\\newFile.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
 
	}

}
