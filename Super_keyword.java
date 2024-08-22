package com.JavaCodingFromScratch;

class parent {
	String colour="BLack";
}
class child extends parent{
	String colour="Red";
	public void disp() {
		System.out.println(colour);
		System.out.println(super.colour);

		
	}
}

public class Super_keyword {

	public static void main(String[] args) {
	       child c= new child();
	       c.disp();
  	}
	

}
