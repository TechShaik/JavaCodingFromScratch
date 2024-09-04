package com.JavaCodingFromScratch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IinkedList_intersecton {

	public static void main(String[] args) {
	      List<Integer> l1=new ArrayList<>(Arrays.asList(10,20,30));
	      List<Integer> l2=new ArrayList<>(Arrays.asList(30,40,50));
	      int point=0;
	      System.out.println("List 1: "+l1+" "+"List 2: "+l2);
	      for(int i=0;i<=l1.size()-1;i++) {
	    	  for(int j=0;j<=l2.size()-1;j++) {
	    		  if(l1.get(i)==l2.get(j)) {
	    			 point=l1.get(i);
	    		  }
	    	  }
	      }System.out.println("Intersection Point : "+point);

	}

}
