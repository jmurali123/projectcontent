package coreJava;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.TreeMap;

public class jumble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str="ofnnoieunre";
//		
//		Map<String,Boolean> mp=new TreeMap<String,Boolean>();
//		for(int i=0;i<str.length();i++) {
//			for(int j=i+1;j<str.length();j++) {
//				System.out.println(str.substring(i,j));
//			}
//		}
		
		try {
			InetAddress ip= InetAddress.getByName("www.demowebshop.tricentis.com");
			System.out.println(ip);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
