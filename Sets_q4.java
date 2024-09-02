package com.JavaCodingFromScratch;
import java.util.*;
public class Sets_q4 {
          public static Set<Integer> Sorted_uniqueElements(List<Integer> List){
        	  Set<Integer> s=new TreeSet<>(List);
        	 			return s;
        	  
          }
	public static void main(String[] args) {
             List<Integer> l=Arrays.asList(7,2,9,1,2,9);
            System.out.println (Sorted_uniqueElements(l));
	}

}
