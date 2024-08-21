package com.JavaCodingFromScratch;


        class A{
        	public final void show() {
        		System.out.println("i'm method of A");
        	}
    	  
    	 
	
         }
       class B extends A{  
    	   public void show() {        
    		   
    		   ///we cannot override an final method
    		   
    		   System.out.println("i'm  method of B");
    	   }
            }

public class FinalMethod {

	public static void main(String[] args) {
		
		A obj=new A();
		obj .show();
		
		B obj1=new B();
		obj1.show();           ///doesn't execute
            
	}

}
