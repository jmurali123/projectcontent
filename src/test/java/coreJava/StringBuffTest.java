package coreJava;

public class StringBuffTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sn=new String("Murali");
		sn=sn.concat("Javvadi");
		System.out.println(sn);
		String str="Welcome";
		str=str.substring(2);
		//System.out.println("Substring is "+str.substring(2));
		System.out.println(str);
	
		System.out.println(str.hashCode());
		char ch[]= {'w','e'};
		String str1= new String(ch);
		System.out.println(str1);
		
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("World");
		System.out.println(sb);
		sb.insert(1, "Test");
		
		System.out.println("After insertion "+sb);
		
		sb.replace(1, 5, "");
		System.out.println("After replacing "+sb);
		
		sb.reverse();
		System.out.println("After reversing "+sb);
		
		StringBuilder sbr=new StringBuilder("Selenium");
		sbr.reverse();
		// 16 -  16*2+2 33
		System.out.println(sbr);
		StringBuilder s=new StringBuilder();
		System.out.println(s.capacity());
		
		
		
		
		
		
	}

}
