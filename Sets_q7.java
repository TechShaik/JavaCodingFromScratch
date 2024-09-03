package com.JavaCodingFromScratch;
import java.util.*;
public class Sets_q7 {
       public static long AddData(Set<Integer> s) {
    	   long startTime=System.currentTimeMillis();
;    	   for(int i=0;i<1000000;i++) {
    		   s.add(i);
    	   }
		return System.currentTimeMillis() - startTime;
       }
       
       public static float remData(Set<Integer> s) {
    	   long startTime=System.currentTimeMillis();
    	   for(int i=0;i<1000000;i++) {
    		   s.remove(i);
    	   }
    	   return System.currentTimeMillis() - startTime;       } 
       
       public static float checkData(Set<Integer> s) {
    	   long startTime=System.currentTimeMillis();
    	   for(int i=0;i<1000000;i++) {
    		   s.contains(i);
    	   }
    	   return System.currentTimeMillis() - startTime;       }
	public static void main(String[] args) {
		 Set<Integer> s=new HashSet<>();
		 Set<Integer> ls=new LinkedHashSet<>();
		 Set<Integer> ts=new TreeSet<>();
		 System.out.println("for Hashset: ");
       System.out.println("for Adding :"+ AddData(s));
       System.out.println("for deleting :"+  remData(s));
       System.out.println("for checking :"+ checkData(s));

       System.out.println("for LinkedHashset: ");
       System.out.println("for Adding :"+ AddData(ls));
       System.out.println("for deleting :"+  remData(ls));
       System.out.println("for checking :"+ checkData(ls));

       System.out.println("for Hashset: ");
       System.out.println("for Adding :"+ AddData(ts));
       System.out.println("for deleting :"+  remData(ts));
       System.out.println("for checking :"+ checkData(ts));

	}

}
