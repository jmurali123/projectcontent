package coreJava;

import java.util.HashMap;
import java.util.Map;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Javvadi Murali";

				char[] carry= str.toCharArray();

				Map<Character,Integer>mp=new HashMap<Character,Integer>();
				Map<Integer,Character>dmp=new HashMap<Integer,Character>();

				for(int i=0;i<carry.length;i++){

				 if(!mp.containsKey(carry[i])){
				      mp.put(carry[i],i);
				     
				}
				else{
					 dmp.put(mp.get(carry[i]),carry[i]);
				     dmp.put(i,carry[i]);
				}

				}
				
				System.out.println(dmp);

	}

}
