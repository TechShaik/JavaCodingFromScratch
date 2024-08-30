package com.JavaCodingFromScratch;

public class arr_max {

	public static void main(String[] args) {
           int []arr= {10,20,50,500,30,2};
           int max=arr[0];
           for(int i=0;i<=arr.length-1;i++) {
        	   if(max<arr[i]) {
        		   max=arr[i];
        	   }
           }System.out.println("Maximum element is :"+max);
	}

}
