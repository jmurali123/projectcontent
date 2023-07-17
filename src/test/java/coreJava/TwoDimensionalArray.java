package coreJava;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     int[][]a= new int[][] {{2,3,4},{3,4,5}};
//   /*  
//     int[][]arr=new int[3][];
//     arr[0]=new int[1];
//     arr[1]=new int[2];
//     arr[2]=new int[3];
//     */
//   //  System.out.print(a[0].length);
//    // System.out.print(a[1].length);
//     
//   //  System.out.print(a[0][1]);
//  //   System.out.print(a[2].length);
//     
//     for(int i=0;i<a.length;i++) {
//    	 for(int j=0;j<a[i].length;j++) {
//    		 System.out.print(a[i][j]+ " ");
//    		
//    	 }
//    	 System.out.println();
//     }
//     
//     for(int[] a1:a) {
//    	 for(int ele: a1) {
//    		 System.out.print(ele);
//    	 }
//    	 System.out.println();
//     }
     
     int [][][] test= {{{1,2,-3},{2,3,4}},
    		 {{-4,-5,6,9},{1},{2,3}}};
     System.out.println(test[0][1][1]);
	
	for(int[][] array2d: test) {
		for(int[]array1d: array2d) {
			for(int item:array1d) {
				System.out.print(item);
			}
			System.out.println();
		}
	}
     
	}
}


