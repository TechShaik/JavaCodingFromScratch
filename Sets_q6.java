package com.JavaCodingFromScratch;
import java.util.*;
public class Sets_q6 {
    public static boolean checkSubset(Set<Integer>s1,Set<Integer>s2){
    	 return s2.containsAll(s1);
    }
	public static void main(String[] args) {
		 Set<Integer> s1=new HashSet<>();
		 s1.add(1);
		 s1.add(2);
		 s1.add(3);
		 Set<Integer> s2=new HashSet<>();
		 s2.add(1);
		 s2.add(2);
		 s2.add(3);
		 s2.add(4);
		 System.out.println(checkSubset(s1,s2));
		 
		 Set<Integer> s3=new LinkedHashSet<>();
         s3.add(1);
		 s3.add(2);
		 s3.add(3);
		 Set<Integer> s4=new LinkedHashSet<>();
         s4.add(1);
		 s4.add(2);
		 s4.add(3);
		 s4.add(4);
		 System.out.println(checkSubset(s3,s4));

		 Set<Integer> s5=new TreeSet<>();
		 s5.add(1);
		 s5.add(2);
		 s5.add(3);
		 Set<Integer> s6=new TreeSet<>();
		 s6.add(1);
		 s6.add(2);
		 s6.add(3);
		 s6.add(4);
		 System.out.println(checkSubset(s5,s6));

		 
		 
		 

	}

}
