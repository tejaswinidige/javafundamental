package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileIntro {

	public static void main(String[] args) {
		///Using the relative path
		File file = new File("newFile.txt");
		try {
			boolean result = file.createNewFile();
			if(result) {
				System.out.println("File created successfully");
			}else {
				System.out.println("There is some error while creating a file");
			}
		} catch (IOException e) {
			System.out.println("Exception handled");
			e.printStackTrace();
		}

	}

}
