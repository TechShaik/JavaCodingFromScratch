package com.JavaCodingFromScratch;
class pr extends pro{
	private int ba=10;
}


public class A_Modifiers_Private {
            public static void main(String[] args) {
				pr obj=new pr();                //these are used to test other modifiers out side the files
				System.out.println(obj.a);
				
                    def d =new def();
                    System.out.println(d.a);
			///	pr.ba;      it cannot be accessed out side class
			               ///it can be accessed inside the class only
 
		}
}
