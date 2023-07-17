package coreJava;

public class Clonning implements Cloneable{

	 int a;
	 String name;
	 Clonning(int a, String name){
		 this.a=a;
		 this.name=name;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clonning a=new Clonning(10,"test1");
		try {
			Clonning b= (Clonning) a.clone();
			System.out.println(b.a);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
