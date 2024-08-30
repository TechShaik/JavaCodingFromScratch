package com.JavaCodingFromScratch;

public class Fisrt_occur {
	 public static int ls(int []array,int key) {
			for(int i=0;i<=array.length-1;i++) {
				if(array[i]==key) {
					return i;
				} 
				}
			
			return -1;
		 }
	public static void main(String[] args) {
		 int[]ar= {10,200,30,30,40,50};
         int key=30;
            System.out.println(key+" first occured at "+  ls(ar,key));
 

          
	}

}
