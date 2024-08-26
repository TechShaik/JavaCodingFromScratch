package com.JavaCodingFromScratch;
import java.util.*;

public class Maps {

	public static void main(String[] args) {
                
		Map<Integer,String> m =new HashMap<>();
		Map<Integer,String> m1=new Hashtable<>();           //all have same methods
		Map<Integer,String> m2=new LinkedHashMap<>();

		
		
		m.put(100, "shaik");                 //to add the elements
		m.put(102, "shahid");
		m.put(104, "suhail");
		m.put(105, "shaiks");
		m.put(106, "shahids");
		m.put(107, "suhails");
		
		System.out.println(m.get(104));         //to print specific key
		
		Iterable<Integer>keys= m.keySet();         //to retrieve all the keys
		System.out.println(keys);
		
		Iterable<String> val=m.values();           //to retrieve all values
		System.out.println(val);
		

      for(int k : keys) {
    	  System.out.println(k+">>>"+m.get(k));     ///to get keys along with values   	  
    	  }
      
      m.remove(104);
      System.out.println(m);
      
      
      
      }

}
