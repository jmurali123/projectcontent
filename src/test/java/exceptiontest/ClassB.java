package exceptiontest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassB {
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner s=null;
     try {
		 s= new Scanner(System.in);
		System.out.println("Enter first number");
		int a=s.nextInt();
		System.out.println("Enter second number");
		int b=s.nextInt();
		
		int result=a/b;
		
		System.out.println(result);
		
	}
     catch(ArithmeticException e1) {
    	 System.out.println("Arthementic exception occured");
    	// e.printStackTrace();
     }
     catch(InputMismatchException e2) {
    	 System.out.println("You have entered otherthan int. Please enter only integers");
     }
     finally {
    	 s.close();
     }
	}

}
