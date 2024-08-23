package com.JavaCodingFromScratch;

import java.util.LinkedList;
 
public class linkedList {

	public static void main(String[] args) {
             LinkedList <Integer> i= new LinkedList<Integer>();
                i.add(50);
                i.add(78);
                i.add(98);
                System.out.println(i);
                LinkedList <Integer> i2= new LinkedList<Integer>();
                i2.addAll(i);   
                System.out.println(i2);

                i2.addAll(2,i);
                System.out.println(i2);
                 
              System.out.println(  i2.get(4));
              i2.set(5, 8);
              System.out.println(i2);
              i2.remove(i);
              System.out.println(i);
              i.remove(1);
              System.out.println(i);
              i.clear();
              System.out.println(i);


	}

}
