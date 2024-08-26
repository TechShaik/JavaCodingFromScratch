package com.JavaCodingFromScratch;
import java.util.*;
public class sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Set<Integer> s= new HashSet<>();         ///all have same methods
		s.add(45);
		s.add(78);
		s.add(98);
		s.add(45);
		s.add(8);
		s.add(41);
		System.out.println(s);
		
		s.remove(41);
		s.contains(45);
		System.out.println(s);
		
		Set<Integer> s1= new TreeSet<>();         //TreeSet gives the output in ascending order
		s1.add(45);
		s1.add(78);
		s1.add(98);
		s1.add(45);
		s1.add(41);
		s1.add(8);
		System.out.println(s1);
		s.remove(45);
		s.contains(98);
		System.out.println(s1);

		

	}

}
