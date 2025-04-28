package day_35_fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingData {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Dell\\Desktop\\FilHandlingKolkata\\batman\\demo.txt";
		File file = new File(path);
		FileOutputStream fos = new FileOutputStream(file, true);
		String message = ", would you like to have breakfast?";
		byte[] arr = message.getBytes();
		fos.write(arr);
		for (int i = 0; i < message.length(); i++) {
			fos.write(message.charAt(i));
		}
	}
}
