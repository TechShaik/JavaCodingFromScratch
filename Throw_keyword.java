package com.JavaCodingFromScratch;

public class Throw_keyword {

	public static void main(String[] args) {
		int a=9;
		int b=7;
		try {
		float c=a/b;
		System.out.println(c);

		}
		catch(ArithmeticException ae) {
		System.out.println(ae.getMessage());
		throw ae;             //////////      we can explicitly throw error by using throw keyword
 		}
		finally {
			System.out.println("Exception caught");
		}
 
 		
		System.out.println(a+b);
	}

}
