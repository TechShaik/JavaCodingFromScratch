package com.JavaCodingFromScratch;
class TM implements Runnable{
	public void run() {
		System.out.println("My thread is runing.......");

	}
}

public class Thread_implementing_interface {

	public static void main(String[] args) {
               TM t2=new TM();
               Thread t=new Thread(t2);
               t.start();
               
	}

}
