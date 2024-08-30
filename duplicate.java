package com.JavaCodingFromScratch;

public class duplicate {

	public static void main(String[] args) {
		 int[]ar= {45,10,800,200,30,30,40,50,200,40,10,45,50};
		 boolean duplicate=false;
		 System.out.print("First non duplicate element is :");
		 for(int i=0;i<=ar.length-1;i++) {
			 for(int j=0;j<=ar.length-1;j++) {
			 if(i!=j && ar[i]!=ar[j]) {
 				duplicate=true;
				 break;
			 } 
			 }if(duplicate) {
		System.out.println(ar[i]);
		break;
		 } }}

}
