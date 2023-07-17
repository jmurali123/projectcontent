package coreJava;

   class Parent {
	private int a=10;
	
	public int getA() {
		return this.a;
	}

}

public class Subclass extends Parent{
	
	void display() {
		System.out.println("Value of a from parent is "+getA());
	}
	
	public static void main(String []args) {
		Subclass obj=new Subclass();
		obj.display();
		String str="Selenium";
		char charr[]=str.toCharArray();
		
		//charr -> S,e,l,e,n,i,u,m
		for(int i=0;i<charr.length;i++) {
			System.out.print(charr[i]);
		}
		System.out.println("Enhanced for loop");
		for(char ch: charr) {
			System.out.print(ch);
		}
		int i=20;
		while(i>0){
			System.out.print(i+" ");
			i--;
		}
		
		int j=-2;
		do {
			System.out.println(j);
		}while(j>0);
		
	}
}
