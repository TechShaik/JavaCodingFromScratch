package com.JavaCodingFromScratch;

class A{
	public void display() {
		System.out.println("Hello");
		
	}
	
	public void display(int a) {
         System.out.println(a);		
		
	}
}

public class Polymorphism_Overloadingg {

	public static void main(String[] args) {
                   
		A obj=new A();
		obj.display();
		obj.display(5);
	}

}
