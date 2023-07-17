package coreJava;

import java.util.Iterator;

import java.util.TreeSet;

public class TreeSettest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 TreeSet<String> set= new TreeSet<String>();
		    set.add("Sachin");
		    set.add("Tendulkar");
		    set.add("Sachin");
		    set.add("Sowrav");
		    set.add("Kohli");
		 //   set.add(null);
		 //   set.add(null);
		    
		    System.out.print(set);
		    Iterator<String>itr=set.iterator();
		    while(itr.hasNext()) {
		   	 System.out.print(itr.next());
		    }
	}

}
