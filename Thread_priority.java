package com.JavaCodingFromScratch;

class S extends Thread{
	public void run() {
		System.out.println("Thread starts runnning...........");
	}
}
public class Thread_priority {

	public static void main(String[] args) {
               Thread t1=new Thread("Thread 1");
               t1.setPriority(3);
               Thread t2=new Thread("Thread 1");
               t2.setPriority(2);
               Thread t3=new Thread("Thread 1");
               t3.setPriority(1);
               
               System.out.println(t1.currentThread().getName()+" "+t1.getName()+" "+t1.getPriority());
               
               System.out.println(t2.currentThread().getName()+" "+t2.getName()+" "+t2.getPriority());

               System.out.println(t3.currentThread().getName()+" "+t3.getName()+" "+t3.getPriority());
               
             

               

	}

}
