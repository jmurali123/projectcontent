package coreJava;

public class inttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Murali";

		int count=0;

		char[] chArry=str.toCharArray();

		for(char c:chArry){
		if(c=='a'){
		count=count+1;
		}
		else if(c=='e'){
		count=count+1;
		}
		else if(c=='i'){
		count=count+1;
		}
		else if(c=='o'){
		count=count+1;
		}
		else if(c=='u'){
		count=count+1;
		}
		else{
		}
		}
		System.out.println("Number of ovwels are "+count);
		}




	}

