package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1=new ArrayList<String>();
		l1.add("Rahul");
		l1.add("Sachin");
		l1.add("Dhoni");
		l1.remove(3);
		
		System.out.println(l1.get(2));
		
		
		//Iterator itr=l1.iterator();	
		
		
		Collections.sort(l1);
		for(String s:l1) {
			System.out.print(s+ " ");
		}
		
		Integer a[]=new Integer[] {10,20,30};
		List<Integer> l2=Arrays.asList(a);
		System.out.print(l2);
		
		
	}

}
