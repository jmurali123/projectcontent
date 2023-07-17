package coreJava;


import java.util.InputMismatchException;
import java.util.Scanner;



public class ExcepTest {
	  public static void main(String[] args) {
		 
		  try {
			  int a,b,result;
			  Scanner s= new Scanner(System.in);
			  a=s.nextInt();
			  b=s.nextInt();
			  result=a/b;
			  System.out.println(result);
		  }
		  catch(ArithmeticException are) {
			  System.out.println(are.getMessage());
		  }
		  catch(InputMismatchException inv) {
			  System.out.println("input mismatch exception");
		  }
		  catch(Exception ex) {
			  System.out.println("Generic exception");
		  }
		
	    }
}




