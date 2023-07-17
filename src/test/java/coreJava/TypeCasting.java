package coreJava;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		//Automatic casting from int to long  === Widening type casting
		long l=i;
		
		//Automatic casting from int to double
	    double d=i;
	    
	    System.out.println("int i= "+i);
	    System.out.println("long l= "+l);
	    System.out.println("double d= " +d);
	    //Explicit - narrowing
	    double a=100.245;
	    short b=(short) a;
	    int c=(int) a;
	    
	    System.out.println("Before casting "+a);
	    System.out.println("After casting to short "+b);
	    System.out.println("After casting to int "+c);

	}

}
