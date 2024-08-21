package com.JavaCodingFromScratch;

        final class X{
	public final void show() {
		System.out.println("i'm method of A");
	}
  
 

 }
class Y extends X{        ///we cannot extend an final class
   public void show() {        
	   
	   ///we cannot override an final method
	   
	   System.out.println("i'm  method of B");
   }
    }

public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
