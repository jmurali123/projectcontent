package coreJava;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     int a=5;
//     double b=5.25;
//     
//     Integer aobj=Integer.valueOf(a);
//     System.out.print(aobj.MAX_VALUE);
//     
//     Integer intobj= 20; //- autoboxing
//     System.out.println(intobj.MIN_VALUE);
//     
//     int a1=intobj;
//     
//    // int a3=(Integer) null;
//     //System.out.print(a3);
//     Integer x=null;
//     System.out.print(x);
		
     
//		char ch='m';
//		boolean isDigit=Character.isDigit(ch);
//		System.out.println("Is a digit: " +isDigit);
//		boolean isLetter=Character.isLetter(ch);
//		System.out.println("Is a letter: "+isLetter);
//		char uppercase=Character.toUpperCase(ch);
//		System.out.println("UpperCase: "+uppercase);
//		char lowercase=Character.toLowerCase(ch);
//		System.out.println("LowerCase: "+lowercase);
//		boolean isWhitespace=Character.isWhitespace(ch) ;
//		System.out.println("Is a whitespace character: "+isWhitespace);
//		
		//Reverse a string by leaving the special characters in the same place
		//c,b$a  ->a,b$c
		//c,b$a ->a$b,c
		
		String str1="Test";
		String str2="Test";
		String str3= new String("Test").intern();
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		
		String s1="Hello";  // immutable
		String s2=s1.concat("World");
		
		System.out.println(s2);
		System.out.println(s1);
		
		
		}

}
