package coreJava;

public class TestTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte myMinBytevalue=-128;   //-128 to 127
		byte myCalBytevalue=(byte) ((myMinBytevalue)/2);
		
		byte myMincalByte= (-128/2);
		
		
		short myMinShortValue=500;
		short myCalShortValue=(short) (myMinShortValue/2);
		
		
		double myMinDouble=50000;
		double myCalDoubleValue=(myMinDouble/2);
		
		//float double
		float f=5.25f;
		
		double d=5.25;
		
		float myNewfloat=5.00f/3.00f;
		System.out.println("My new float val "+myNewfloat);
		
		double mynewDouble= 5.00d/3.00d;
		System.out.println("My new double val "+mynewDouble);
		

	}

}
