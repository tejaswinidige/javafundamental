package Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] ch = new char[100];
		try {
			FileReader reader = new FileReader("C:\\Users\\Admin\\Desktop\\FilesFolder\\newFile.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				BufferedReader buffer = new BufferedReader();
	} 

}
