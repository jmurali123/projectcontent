package coreJava;

public class StringrevwithSpecialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="a,b$c";
		int j=str.length()-1;
		
		char ch[]=str.toCharArray();
		char temp;
		for(int i=0; i<j;i++,j--) {
			if(!Character.isAlphabetic(ch[i])) {
				i++;
			}else if(!Character.isAlphabetic(ch[j])) {
				j--;
			}
			else{
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				i++;
				j--;
				
				
			}
		}
       System.out.println(ch);
	}

}
