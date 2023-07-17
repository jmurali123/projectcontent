package exceptiontest;

public class AgeValidation {
	
	public void validate(int age) throws InvalidException  {
		if(age<18) {
			throw new InvalidException("Invalid age entered");
		}
		else {
			System.out.println("Valid age");
		}
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
      AgeValidation check= new AgeValidation();
      
      try {
		check.validate(15);
	} catch (InvalidException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
