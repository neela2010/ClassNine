package externalFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class WriteHTML {
	
	public static void main(String[] args) throws IOException {
		

		SimpleDateFormat formatter = new SimpleDateFormat("MM_DD_YYYY_HH_mm_ss");
		Date date = new Date();
		String StartTime = formatter.format(date);
		//System.out.println(StartTime);
		
		String path = "Data\\WriteTextFile_" + StartTime + ".html"; // relative path
		// File
		File f = new File(path);

		// write the file
		FileWriter fw = new FileWriter(f, true); // true will make add/append lines in same file 

		// BUfferedWriter to write character of file
		BufferedWriter bfw = new BufferedWriter(fw);

		bfw.write("<html><head><title>Page Title</title></head><body bgcolor=\"skyblue\"><h1>Hello World!</h1><p>");
		//bfw.write(getRandomNumberInRange( 100,  999) + " " ); // if u ever concatenate string with any datatype java will read it as String
		
		for( int i=0; i<500;i++) {
			
			bfw.write(getRandomNumberInRange( 100,  999) + " " );
			bfw.write("<br>");
		}
		
		
		bfw.write("</p></body></html>");
		
		bfw.close();
		
		
	}
	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
