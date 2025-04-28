package day_35_fileHandling;

import java.io.File;

public class Demo {
	public static void main(String[] args) {
		String path = "C:\\Users\\User\\Desktop\\FileHandling\\One\\Two";
		String path2 = "C:\\Users\\User\\Desktop\\FileHandling\\One\\New";
		File file = new File(path);
		File renameFile = new File(path2);
		
//		file.mkdirs();
		file.renameTo(renameFile);
		
		
		
		
	}
}
