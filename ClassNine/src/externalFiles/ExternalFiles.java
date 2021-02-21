package externalFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExternalFiles {

	public static void main(String[] args) throws IOException {
		
		//In order to deal with properties file, need three things
		//1. need properties object
		//2. need fileInputStream object and give the location of file in parenthesis.
		//3. and need to use .load to fileInputStream
		//

		String path = "Data\\config.properties"; //Relative path
		Properties propFile = new Properties();
		FileInputStream fis = new FileInputStream(path);
		propFile.load(fis);

		System.out.println(propFile.getProperty("name"));
		System.out.println(propFile.getProperty("course"));
	}

}
