package coreJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file= new File("C:/Frameworks/Selenium040523/FileTest.txt");
		
		if(file.exists()) {
			System.out.println("File exists");
			System.out.println("File name is "+file.getName());
			System.out.println("File path is "+file.getPath());
			System.out.println("File size is "+file.length());
			System.out.println("File size is "+file.getAbsolutePath());
		}
		Charset charsetName= StandardCharsets.UTF_8;
		try {
			FileInputStream fis= new FileInputStream(file);
			InputStreamReader reader = new InputStreamReader(fis,charsetName);
			try {
				int charData;
				while((charData=reader.read())!=-1) {
					System.out.println((char)charData);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
