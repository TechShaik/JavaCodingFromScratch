package com.JavaCodingFromScratch;
import java.util.*;
public class stack {

	public static void main(String[] args) {
            Stack<Integer> s=new Stack<Integer>();
            s.push(5);         ///to push means add
            s.push(78);
            s.push(78);

            s.push(787);
            System.out.println(s);
 
            s.pop( );         //to pop means remove
            System.out.println(s);        
            System.out.println(s.peek());       ///to see top element 
            System.out.println(s.indexOf(78));     /// to see element at specific index
            
	}

}
