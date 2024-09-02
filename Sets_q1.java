package com.JavaCodingFromScratch;
import java.util.*;
public class Sets_q1 {
	
	public static Set<Integer> createHashset(List<Integer> List) {
		 Set<Integer> s=new HashSet<>(List);
		 return s;
 	}
	
	public static Set<Integer> createLinkedHashSet(List<Integer> List) {
		 Set<Integer> s=new LinkedHashSet<>(List);
		 return s;
 	}
	public static Set<Integer>  createTreeSett(List<Integer> List) {
		 Set<Integer>s= new TreeSet<>(List);
		 return s;
 	}

	public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        System.out.println("Hashset"+createHashset(list));
        System.out.println( "LinkedHashSet"+createLinkedHashSet(list));
        System.out.println( "TreeSet"+ createTreeSett(list));
	}

}
