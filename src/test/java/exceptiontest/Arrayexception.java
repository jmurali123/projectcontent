package exceptiontest;

import java.util.ArrayList;

public class Arrayexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= {1,2,3};
		//System.out.println(a[4]);
		ArrayList<Integer> n= new ArrayList<Integer>();
		int i=0;
		while(true) {
			n.add(1);
			System.out.println("Added 1 for " +i);
			i=i+1;
		}

	}

}
