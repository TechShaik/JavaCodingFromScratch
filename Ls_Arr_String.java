package com.JavaCodingFromScratch;

public class Ls_Arr_String {
	
	public static int   ls(String[]ar,String s) {
		for(int i=0;i<=ar.length-1;i++) {
			if(ar[i]==s) {
				System.out.println(i);
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
          String [] arr= {"aa","asf","sh","ss","sl"};
          String s="sh";
         System.out.println(s + " found at "+ ls(arr,s));
          
	}

}
