package com.JavaCodingFromScratch;

class parent1 {
        public void show() {
        	System.out.println("I'm parent class method");
        	}
        }
class child1 extends parent1{
       	public void show() {
		System.out.println("I'm child class method");		
	}
       	public void s() {
       		super.show();
       	}
}

public class super_withMethods {

	public static void main(String[] args) {
	       child1 c= new child1();
	       c.show();
	       c.s();
  	}
	

} 