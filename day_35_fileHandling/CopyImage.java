package day_35_fileHandling;

import java.io.File; 
import java.io.FileInputStream;
import java.io.FileOutputStream; 

public class CopyImage {
	public static void main(String[] args) throws Exception{
	// creating new ing file 
		String destinationPath = "C:\\Users\\Dell\\Desktop\\FilHandlingKolkata\\batman\\image.jpg"; 
		File destinationFile = new File(destinationPath); 
		destinationFile.createNewFile(); 
		// creating file object of source image 
		String sourcePath = "E:\\images\\wallpaper.jpg"; 
		File sourceFile = new File(sourcePath); 
		// reading data from source image 
		FileInputStream fis = new FileInputStream(sourceFile); 
		byte[] arr = new byte[(int)sourceFile.length()];
		
		fis.read(arr);
		
		FileOutputStream fos = new FileOutputStream(destinationFile);
		fos.write(arr);
		
		fos.close();
		fis.close();
	}
}
