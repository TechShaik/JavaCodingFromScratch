package com.JavaCodingFromScratch;

public class Exception {

	public static void main(String[] args) {
                  
		int a=9;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);

		}
		catch(ArithmeticException ae) {
		System.out.println(ae.getMessage());
 		}
		finally {
			System.out.println("Exception caught");
		}
 
 		
		System.out.println(a+b);
	}

}
