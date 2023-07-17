package coreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(1, "Kohli");
		map.put(2, "Sachin");
		map.put(3, "Miller");
		map.put(null, "Dravid");
		map.put(null, null);
		System.out.println(map);
		System.out.println(map.entrySet());
		Set<Map.Entry<Integer,String>>s=map.entrySet();
		
		for(Map.Entry<Integer, String> it  :s) {
			System.out.println(it.getKey() + "--->" +it.getValue());
		}
		
	}

}
