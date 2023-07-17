package coreJava;

public class SortingTest {

	
	public static int[] sorttest(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []a=new int[] {24,34,12,43,10};
      a=sorttest(a);
      
      for(int v: a) {
    	  System.out.print(v +" ");
      }
	}

}
