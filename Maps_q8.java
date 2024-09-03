package com.JavaCodingFromScratch;
import java.util.*;
class Employee{
	String name;
	int id;
	String dep;
	Employee(String name,int id,String dep, Map<Integer,Employee> em){
		this.name=name;
		this.id=id;
		this.dep=dep;
          em.put(id, this);	
	}
	
	public String toString() {
		return "name: "+name +" & id : "+id +" & dept: "+dep;
				}
	
	public static void disp(int id, Map<Integer,Employee> m1) {
		 Employee s=m1.get(id);
		 System.out.println(s);
	}
}
public class Maps_q8 {

	public static void main(String[] args) {
		 Map<Integer,Employee> m1=new HashMap<>();
		 Employee e1=new Employee("shaik",1,"cse",m1);
		 Employee e2=new Employee("sravs",11,"ece",m1);
		 Employee e3=new Employee("ram",111,"mec",m1);
               Employee.disp(111,m1);
	}

}
