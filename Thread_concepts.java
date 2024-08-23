package com.JavaCodingFromScratch;

class M extends Thread{
	public void run() {
		System.out.println("My thread started running............");
	}
}


public class Thread_concepts {

	public static void main(String[] args) {
                     Runnable r1=new M();

                  Thread t=new Thread(r1,"I am Thread 1");      ///////we can set name of thread like this   and its using thread (runnable,string) Constructor
              
                              t.start();
              
                 System.out.println(t.getName());                /////It returns thread name
               
                
               
               
               
	}

}
