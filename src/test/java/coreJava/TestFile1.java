package coreJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	BufferedReader reader = new BufferedReader(new FileReader("C:/Frameworks/Selenium040523/FileTest.txt"));
    String line;
    try {
    	
		while((line=reader.readLine())!=null) {
			System.out.println(line);
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
