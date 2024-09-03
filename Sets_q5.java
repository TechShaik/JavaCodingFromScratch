package com.JavaCodingFromScratch;
import java.util.*;
public class Sets_q5 {
	
	String name;
	int age;
	Sets_q5(String name,int age){
		this.name=name;
		this.age=age;
	}
	
//	 public boolean equals(Object o) {
//	        if (this == o) return true;
//	        if (o == null || getClass() != o.getClass()) return false;
//	        Sets_q5 sets_q5 = (Sets_q5) o;
//	        return age == sets_q5.age && Objects.equals(name, sets_q5.name);
//	    }
		
	
//	public int hashCode() {
//		return Objects.hash(name,age);
//		
//	}

	public static void main(String[] args) {
		 Set<Object> s=new HashSet<>();
      Sets_q5 p1=new Sets_q5("shaik",22);
      Sets_q5 p2=new Sets_q5("sravs",21);	
      s.add(p1);
      s.add(p2);
      boolean b=s.contains(p1);
      System.out.println(b);

	}

}
