package day_35_fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
	public static void main(String[] args) throws Exception {
		String path = "";
		File file = new File(path);
		file.createNewFile();
		
		Employee employee = new Employee("Argha", 1, 26000);
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream os = new ObjectOutputStream(fos);
		
		os.writeObject(employee);
		os.flush();
		
		os.close();
		fos.close();
	}
}
