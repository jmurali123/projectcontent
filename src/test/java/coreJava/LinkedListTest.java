package coreJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<String> l=new LinkedList<String>();
     l.add("Sachin");
     l.add("Rahul Dravid");
     Iterator<String>itr=l.iterator();
     while(itr.hasNext()) {
    	 System.out.print(itr.next());
     }
		
	}

}
