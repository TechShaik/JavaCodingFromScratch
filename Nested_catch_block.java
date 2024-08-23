package com.JavaCodingFromScratch;

public class Nested_catch_block {

	public static void main(String[] args) {
                  try {
                	  int[] arr=new int[8];
                	  arr[1]=45/0;
                	  arr[10]=78;
                  }  ///This is multi catch program
                  catch(ArithmeticException ae){
                	  System.out.println(ae.getMessage());
                  }
                  catch(ArrayIndexOutOfBoundsException a) {
                	  System.out.println(a.getMessage());

                                    }
                                 
                  }
}
