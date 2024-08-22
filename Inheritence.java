package com.JavaCodingFromScratch;


class user{
	public void use() {
		System.out.println("Can use the Application");
	}
	
}

class developer extends user{
	public void edit() {
		System.out.println("Can edit the application");
	}
	 
}
 
class admin extends developer{
	public void anything() {
		System.out.println("Can do anything");
	}
	
	
}
public class Inheritence {

	public static void main(String[] args) {
		user a=new user();
		developer d=new developer();
		admin ad=new admin();
		a.use();                ///can access only that class method
		d.edit();                  ///can access both user and developer method
		d.use();
		ad.use();              ///can access any class methods
		ad.edit();
		ad.anything();
		
//		a.anything();   parent class cannot access the child class methods
		
             
	}

}
