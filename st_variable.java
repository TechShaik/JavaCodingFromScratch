package com.JavaCodingFromScratch;

class emp{
 	int id;
 	int sal;
	static String ceo;
	public void show() {
		System.out.println(id+ ":"+ sal +":"+ceo);
	}
	
	
	static {       //  when class is loaded
		 ceo="me ";
		 System.out.println("in static");

		
	}
	
	public emp() {           ///when object is created--heap memory
		System.out.println("Constructor called");
	}
}

 

public class st_variable {

	public static void main(String[] args) {
               
		emp rahul=new emp();
		rahul.id=1;
		rahul.sal=50000;
	//	emp.ceo="shaik";
		emp ram=new emp();
		ram.id=2;
		ram.sal=25000;
    //    emp.ceo="shaik";
		
	//	emp.ceo="naziya";  if once assigned it will be assigned to all

		
        rahul.show();
       ram.show();
	}

}
