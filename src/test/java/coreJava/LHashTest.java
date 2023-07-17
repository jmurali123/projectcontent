package coreJava;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LHashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedHashSet<String> set= new LinkedHashSet<String>();
    set.add("Sachin");
    set.add("Tendulkar");
    set.add("Sachin");
    set.add("Sowrav");
    set.add("Kohli");
    set.add(null);
    set.add(null);
    
    System.out.print(set);
    Iterator<String>itr=set.iterator();
    while(itr.hasNext()) {
   	 System.out.print(itr.next());
    }
	}

}
