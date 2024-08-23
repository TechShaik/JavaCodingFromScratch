package com.JavaCodingFromScratch;
import java .util.*;

public class vectors {

	public static void main(String[] args) {
            Vector<Integer>v1=new Vector<Integer>();         ///         create
            System.out.println(v1.size());
            System.out.println(v1.capacity());
            v1.add(10);
            v1.add(30);
            v1.add(50);                                      /////          added
            v1.add(40);
            v1.add(60);
            v1.add(10);
            v1.add(30);
            v1.add(50);                                      /////          added
            v1.add(40);
            v1.add(60); v1.add(10);
            v1.add(30);
            v1.add(50);                                      /////          added
            v1.add(40);
            v1.add(60);
            System.out.println(v1.size());
            System.out.println(v1.capacity());


            System.out.println(v1);
            v1.set(0, 500);                                 ////      updated
            System.out.println(v1);
            Vector <Integer>v2=new Vector<Integer>();
            
             v2.add(50);                                      /////          added
            v2.add(40);
            v2.add(60);
            v2.addAll(2,v1);

            
            System.out.println(v2);
            
            v2.remove(0);
            System.out.println(v2);
            v2.removeAll(v1);
            System.out.println(v2);
            v1.clear();                              ///   cleared all
            System.out.println(v1); 
            Vector <Integer>v3=new Vector<Integer>();
            System.out.println(v3.size());            // default size


	}

}
