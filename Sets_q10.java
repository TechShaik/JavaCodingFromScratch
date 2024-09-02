package com.JavaCodingFromScratch;
import java.util.*;
public class Sets_q10 {
             public static Set<Integer> removeElements(Set<Integer> set,int val){
            	 for(Integer i=0;i<val;i++) {
            		 set.remove(i); 
            	 }
				return set;
             }
	public static void main(String[] args) {
		 Set<Integer> s=new TreeSet<>();
		 s.add(1);
		 s.add(2);
		 s.add(3);
		 s.add(4);
		 s.add(5);
		 int k=3;
		 System.out.println(removeElements(s,k));

	}

}
