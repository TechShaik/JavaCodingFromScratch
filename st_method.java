package com.JavaCodingFromScratch;
class mobile{
	int price;	
	static String name;
	String company;
	
	public void show() {
		System.out.println(price);
		System.out.println(name);
		System.out.println(company);
	}
	public static void  getPhone(mobile m) {
		System.out.println(m.price);
		System.out.println(name);
		System.out.println(m.company);		
	}
	
}
public class st_method {

	public static void main(String[] args) {
            mobile m=new mobile();
            m.price=8000;
            mobile.name="smart-phone";
            m.company="vivo";
            mobile.getPhone(m);
            System.out.println();
            m.show();
	}

}
