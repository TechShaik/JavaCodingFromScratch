package com.JavaCodingFromScratch;

class Tslp extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
 
 			try {
				Thread.sleep(2000);
				System.out.println("Thread name: "+Thread.currentThread().getName());

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);

 
		}
	}
}
 
public class Thread_join {

	public static void main(String[] args) {
                Tslp t1=new Tslp();
                Tslp t2=new Tslp();

                t1.start();
                
                try {
					t1.join( );
					System.out.println("Thread name: "+Thread.currentThread().getName());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                t2.start();
                try {
					t2.join( );
					System.out.println("Thread name: "+Thread.currentThread().getName());

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
