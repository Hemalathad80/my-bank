package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FixxMe {

	public static void completeTheCatchBlock(File file) {
		RandomAccessFile input = null;
		String line = null;

		try {
			input = new RandomAccessFile(file, "r");
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			return;
		} catch (FileNotFoundException ex) {
			System.err.println("File is not found" + file);
		} catch (IOException e) {
			System.err.println("Input output exception" + e.toString());
		}

		finally {
			if (input != null) {
				try{
				input.close();
				}catch (IOException e){
					System.err.println("Could not close the file.");
				}
				 
			}
		}
	}
}
