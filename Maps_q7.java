package com.JavaCodingFromScratch;
import java.util.*;
class pbook{
          String name;
        Long mobile;
        
        pbook(String name,Long mobile, Map<String,Long> m){
        	this.name=name;
        	this.mobile=mobile;
        	m.put(name, mobile);
         }
        
        public    String display(String s,Map<String,Long> m) {
              Long s1= m.get(name);
               
        	return s+"'s mobile number is: "+s1;
        	
        }
        
        public   void remove(String name,Map<String,Long> m) {
        	m.remove(name);
        	System.out.println("Deleted");
        }
        
        public void veiwAll(Map<String,Long> m){
        	for(Map.Entry<String, Long> entry:m.entrySet()) {
        		System.out.println(entry.getKey()+"'s mobile is: "+entry.getValue());
        	}
			 
        }
}


public class Maps_q7 {

	public static void main(String[] args) {
		Map<String,Long> m=new TreeMap<>();
 		pbook p=new pbook("shaikshavali",6303833290L, m);
 		pbook p1=new pbook("sravs",6305522940L,m);		
 		pbook p2=new pbook("shahid",6307896290L,m);	
 		pbook p3=new pbook("ram",9392540901L,m);
          System.out.println(p1.display("shaik", m));    
          p.veiwAll(m);
          p1.remove("shaik", m);
          p.veiwAll(m);

          
	}
	
	 
        	  
          
         	 

}
	
