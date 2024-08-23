package com.JavaCodingFromScratch;

class T  extends Thread{
	public void run() {
		System.out.println("My thread is runing.......");
	}
}

public class Thread_extending_by_class  {

	public static void main(String[] args) {
            T t=new T();
            t.start();
	}

}
