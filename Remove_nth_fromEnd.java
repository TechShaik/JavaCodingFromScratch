package com.JavaCodingFromScratch;

import java.util.*;

public class Remove_nth_fromEnd {

	public static void main(String[] args) {
      List<Integer> l=new ArrayList<>(Arrays.asList(10,20,30,4,50,8,9,60));
      int deleteNode=5;
      System.out.println("Original list: "+l);
      delFromList(l,deleteNode);
      System.out.println("Modified List : "+l);
      
	}

	public static void delFromList(List<Integer> l, int deleteNode) {
       int ind_to_del=l.size()-deleteNode;
		  l.remove(ind_to_del);

	}

}
