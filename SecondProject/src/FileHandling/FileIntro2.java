package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileIntro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		File file = new File("C:\\Users\\Admin\\Desktop\\FilesFolder\\file1.txt");
        try {
			boolean result = file.createNewFile();
			if(result) {
				System.out.println("File created successfully");
			}else {
				System.out.println("Some error");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception handled");
			
			e.printStackTrace();
		}
	}

}
