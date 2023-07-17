package coreJava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map= new TreeMap<Integer,String>();
		map.put(3, "ZKohli");
		map.put(2, "Sachin");
		map.put(1, "Miller");
		//map.put(null, "Dravid");
		//map.put(null, null);
		System.out.println(map);
		System.out.println(map.entrySet());
		Set<Map.Entry<Integer,String>>s=map.entrySet();
		
		for(Map.Entry<Integer, String> it  :s) {
			System.out.println(it.getKey() + "--->" +it.getValue());
		}
	}

}
