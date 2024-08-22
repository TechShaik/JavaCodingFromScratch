package com.JavaCodingFromScratch;

abstract class admin1{
	abstract void show();
	abstract void display();
	
	 
}

class user1 extends admin1 {
	   public void show() {
		System.out.println("I'm method show");
		
	}
	  public  void display() {
		System.out.println("I'm method dispaly");
		
	}
	
}

public class Absrtaction {

	public static void main(String[] args) {
          admin1 a=new user1();
                a.show();
                a.display();
           
        
	}

}
