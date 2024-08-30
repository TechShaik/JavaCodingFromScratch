package com.JavaCodingFromScratch;

public class All_indices {
	 public static int ls(int []array,int key) {
		 System.out.print(key+ " is found at:");
			for(int i=0;i<=array.length-1;i++) {
				if(array[i]==key) {
                     System.out.print(i+" ");				} 
				}
			
			return -1;
	 }
	public static void main(String[] args) {
		 int[]ar= {10,200,30,30,40,50};
         int key=30;
            ls(ar,key);
 
	}

}
