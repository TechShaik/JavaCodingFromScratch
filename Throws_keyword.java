package com.JavaCodingFromScratch;

public class Throws_keyword {

	public static void main(String[] args) throws ArithmeticException  {
             int a=10;
             int b=0;
             try {
             int c=a/b;
             System.out.println(c);
             }
             catch(ArithmeticException ae) {
            	 System.out.println(ae.fillInStackTrace());
             }
             finally {
            	 System.out.println(" ");
             }
           
             System.out.println(a+b);
	}}
