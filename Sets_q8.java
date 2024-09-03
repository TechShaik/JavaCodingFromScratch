package com.JavaCodingFromScratch;

import java.util.*;

public class Sets_q8 {
	public static Set<Integer> findIntersection(Set<Integer>... sets) {
        if (sets == null || sets.length == 0) {
            return new HashSet<>();  }

         Set<Integer> intersection = new HashSet<>(sets[0]);

         for (int i = 1; i < sets.length; i++) {
            intersection.retainAll(sets[i]);
        }

        return intersection;
    }
	

	public static void main(String[] args) {
		 Set<Integer> s1=new HashSet<>();
		 s1.add(1);
		 s1.add(2);
		 s1.add(3);
		 Set<Integer> s2=new HashSet<>();
		 s2.add(2);
		 s2.add(3);
		 s2.add(4);
		 Set<Integer> s3=new HashSet<>();
		 s3.add(3);
		 s3.add(4);
		 s3.add(5);
		 Set<Integer> s4=findIntersection(s1,s2,s3);
		 System.out.println(s4 );


	}

}
