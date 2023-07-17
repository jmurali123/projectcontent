package coreJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		BufferedReader reader;
		
		try {
			reader= new BufferedReader(new FileReader("C:\\Frameworks\\Selenium040523\\projectcontent\\src\\test\\resources\\Test.properties"));
			properties.load(reader);
			String url=properties.getProperty("baseUrl");
			System.out.println(url);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
