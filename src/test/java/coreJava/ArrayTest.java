package coreJava;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//String and char array are not the same.
	
	String str="selenium";
	char ch[]=str.toCharArray();
	
	/*for(char c:ch) {
		System.out.print(c);
	}*/
	
/*	for(int i=0; i<ch.length;i++) {
		char temp=ch[i];
		System.out.print(temp);
	}
	*/
	for(int i=0;i<100000;i++) {
		System.out.println(i);
	}
//	10power5
//	2power3power5= 2power15
	//O(8) //O(n)
	//Auxilary memory O(1)
/*	
	16 - 4  - 2power4   16 -k 2power4
	32 - 5  - 2power5   32 -k 2power5
	
	n  - k   - 2powerk               n  -k 2powerk
	2powerk=n
	k -logn times*/
	
	
	
	
	
//	Big O notation - O(1)
	/*System.out.println("c"+"a");
	System.out.println("c".concat("a"));	*/
	//0-7 =8
		
	//	s e l e n i u m
		
	//	m u i n e l e s
	

}
}