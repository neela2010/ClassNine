package externalFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteCSVFile {
	
	public static void main(String[] args) throws IOException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM_DD_YYYY_HH_mm_ss");
		Date date = new Date();
		String StartTime = formatter.format(date);
		//System.out.println(StartTime);
		
		String path = "Data\\WriteTextFile_" + StartTime + ".csv"; // relative path
		// File
		File f = new File(path);

		// write the file
		FileWriter fw = new FileWriter(f, true); // true will make add/append lines in same file 

		// BUfferedWriter to write character of file
		BufferedWriter bfw = new BufferedWriter(fw);

		bfw.write("name, grade, class");
		bfw.newLine();
		bfw.write("neela, 100, Java");
		
		bfw.close();
		
	}

}
