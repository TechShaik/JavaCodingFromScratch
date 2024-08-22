package com.JavaCodingFromScratch;

class parent2{
	public parent2() {
		System.out.println("I'm parent class constructor");
	}
}
class child2 extends parent2{
	public child2() {
		super();
		System.out.println("I'm child class constructor");
	}
}
public class super_withConstructor {

	public static void main(String[] args) {
           child2 c=new child2();
	}

}
