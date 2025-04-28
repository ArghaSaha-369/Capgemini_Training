package day_35_fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWrite {
	public static void main(String[] args) throws Exception {
		String path = "";
		File file = new File(path);
		file.createNewFile();
		
		try (FileWriter writer = new FileWriter(file)) {
			writer.append("id,name,age\n");
			writer.append("1,Argha,22\n");
			writer.append("2, Anik, 20\n");
			writer.append("3,Deep, 24\n");
			
			System.out.println("CSV file written successfully");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
