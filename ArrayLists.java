 
package com.JavaCodingFromScratch; 
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
     ArrayList<Integer> l1=new ArrayList<Integer>();
     l1.add(5);
     l1.add(55);
     System.out.println(l1);
      l1.add(0,6);
     l1.add(3);
     l1.add(4);           //////// to add
     l1.add(13);
     l1.add(34);
     l1.add(333);
     l1.add(42);
     System.out.println(l1);
     List<Integer> l2=new ArrayList<Integer>();
     l2.addAll(l1);
     l2.add(8);
     System.out.println(l2);
     System.out.println(l1.contains(l2));      ///check elements are present
     System.out.println(l2.contains(l1));
     l2.remove(4);
     
     l1.set(0,1000);          ///////  to update elements
     System.out.println(l2);
     l2.get(4);           ////re-trive specific element
     l1.remove(8);    /////to remove
     for(int i: l1) {
    	 System.out.println(i);      //////to print all elements
         ArrayList<Integer> l3=new ArrayList<Integer>();
         System.out.println(l3.size());   //default size

     }



     
    }
}