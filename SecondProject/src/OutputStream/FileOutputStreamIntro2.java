package OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamIntro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Writing in a new file.\nThis is the second line";
		try {
			OutputStream output =new FileOutputStream("C:\\Users\\Admin\\Desktop\\FilesFolder\\newFile2");
		    byte[] arr = data.getBytes();
		    output.write(arr);
		    System.out.println("Data written successfully..");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
		}

	}

}
