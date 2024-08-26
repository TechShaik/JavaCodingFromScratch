package com.JavaCodingFromScratch;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {  
		
             Queue<Integer> q=new PriorityQueue<Integer>();
 
             q.offer(45);                //to add
             q.add(78);
             System.out.println(q);
             
            System.out.println( q.peek());          //to see top element
            
          q.remove();           //to remove
           System.out.println(q);
           
             System.out.println(q.contains(56));        // to check or verify

             
	}

}
