package exceptiontest;

public class Nullpointertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
		String str=null;
      int length=str.length();
      System.out.println("String length is "+length);
	}
   
     
     finally {
    	 System.out.println("I am final");
     }
    	 System.out.println("out of try");
     }

}
