package com.JavaCodingFromScratch;

class BankDetails{
	private int acc_num;
	private String name;
	
	public void setAcc_num(int acc_num) {
		this.acc_num=acc_num;
	}
	
	public int getAcc_num() {
		return acc_num;
	}
	
	public void setName(String name) {
		this.name=name;;
	}
	
	public String getName() {
 				return name;	}
	
	
}



public class Encapsulation {

	public static void main(String[] args) {
            BankDetails b=new BankDetails();
            b.setAcc_num(1116989);
            b.setName("shaiksha");
           System.out.println( b.getAcc_num());
          System.out.println(  b.getName());
            }

}
