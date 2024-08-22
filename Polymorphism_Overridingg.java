package com.JavaCodingFromScratch;


class hr{
	public void select() {
		System.out.println("Select candidates");
	}
}

class manager extends hr{
	public void select() {
		System.out.println("Check eligible candidates");
	}
	
	public void s1() {
		super.select();
	}
}

public class Polymorphism_Overridingg {

	public static void main(String[] args) {
             hr obj=new hr();
             obj.select();
             System.out.println();
             manager obj2=new manager();
             obj2.select();
             obj2.s1();   ///to call the method in parent class we use super keyword
	}

}
