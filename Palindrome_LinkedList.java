package com.JavaCodingFromScratch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome_LinkedList {

	public static void main(String[] args) {
	      List<Integer> l1=new ArrayList<>(Arrays.asList(10,20,10));
	      List<Integer>l2=new ArrayList<>();
	      for(int i=l1.size()-1;i>=0;i--) {
	    	  l2.add(l1.get(i));
	      }
	      if(l1.equals(l2)) {
	    	  System.out.println("Given Liked List is Palindrome");
	      }else {
	    	  System.out.println("Given Liked List is not Palindrome");

	      }

	}

}
