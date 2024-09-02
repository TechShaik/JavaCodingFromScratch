package com.JavaCodingFromScratch;

import java.util.*;

public class Sets_q2 {
	
	public static Set<Object> createTreeMap(List<Object> List){
		Set<Object> s=new TreeSet<>(List);		
		return s;
	
	}

	public static void main(String[] args) {
		 List<Object> l=new ArrayList<>();
		 l.add("apple");
		 l.add("banana");
		 l.add("apple");
		 l.add("orange");
		 System.out.println(createTreeMap(l));


	}

}
