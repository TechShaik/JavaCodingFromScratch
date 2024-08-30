package com.JavaCodingFromScratch;

public class num_occ {

	public static void main(String[] args) {
           String s="shaikshavali";
           char[]ar=s.toCharArray();
           char c='s';int sum=0;
           for(int i=0;i<=s.length()-1;i++) {
        	   if(ar[i]==c) {
        		   sum+=1;
        	   }
           }System.out.println(c +" repeated "+sum+" times");
	}

}
