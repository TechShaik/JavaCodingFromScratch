package com.JavaCodingFromScratch;
import java.util.*;
public class Remove_Occurences {
         public static void remOccur(List<Integer>l,int n){  
        	 for(int i=0;i<=l.size()-1;i++) {
        		 if(l.get(i)==n) {
        			 l.remove(l.get(i));
         		 }
        	 }
	
             }
	public static void main(String[] args) {
	      List<Integer> l1=new ArrayList<>(Arrays.asList(10,20,10,50,50));
	      int val=10;
	      System.out.println("Original list: "+l1);
           remOccur(l1,val);
           System.out.println("modified list :"+l1);
	}

}
