package externalFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {

		// If file is outside of the project then need to put absolute path instead of
		// relative path

		String path = "Data\\textFile.txt"; // relative path
		// File
		File f = new File(path);

		// Read the file

		FileReader fr = new FileReader(f);

		// BUfferedReader to read character of file

		BufferedReader bfr = new BufferedReader(fr);

		// System.out.println(bfr.readLine()); //
		// System.out.println(bfr.readLine());

		List<String> textLine = new ArrayList<String>();

		String line = null;
		while ((line = bfr.readLine()) != null) {
			//System.out.println(line);
			textLine.add(line);
		}
		System.out.println(textLine.size());
		System.out.println(textLine.get(0));

	}

}
