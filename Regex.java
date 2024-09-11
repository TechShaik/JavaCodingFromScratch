package com.JavaCodingFromScratch;

import java.util.regex.*;

public class Regex {

	public static void main(String[] args) {
		 Pattern p=Pattern.compile(".s");
		 
		 Matcher m=p.matcher("as");
		 
		 boolean b=m.matches();
		 System.out.println(b);
		 
		 boolean b1=Pattern.compile("as").matcher("as").matches();
         System.out.println(b1);
         
         boolean b2=Pattern.matches(".a", "sa");
         System.out.println(b2);
         
         boolean b3=Pattern.matches("[abc]","a");
         System.out.println(b3); 
         
         boolean b4=Pattern.matches("[^abc]","a");
         System.out.println(b4);
         
         boolean b5=Pattern.matches("[abc]","aaa");
         System.out.println(b5);
         
         boolean b6=Pattern.matches("[a-zA-Z]","a");
         System.out.println(b6);
         
         boolean b7=Pattern.matches("[^a-zA-Z]","8");
         System.out.println(b7);
         
         boolean b8=Pattern.matches("[^a-zA-Z]","k");
         System.out.println(b8);
         
         boolean b9=Pattern.matches("[ a-d[m-p]]","l");
         System.out.println(b9);
         
         boolean c=Pattern.matches("[ a-d[m-p]]","n");
         System.out.println(c);
         
         boolean c2=Pattern.matches("[\\d]","5");
         System.out.println(c2);
         
         boolean c3=Pattern.matches("[\\d]","e");
         System.out.println(c3);
         
         boolean c4=Pattern.matches("[\\D]","5");
         System.out.println(c4);         
         
         boolean c5=Pattern.matches("[\\D]","k");
         System.out.println(c5);
         
         boolean c6=Pattern.matches("[\\d]*","4545");
         System.out.println(c6);
         
         boolean c7=Pattern.matches("[\\d]+","45");
         System.out.println(c7);
         
         
         boolean c8=Pattern.matches("[\\s]"," ");
         System.out.println(c8);
         
         boolean c9=Pattern.matches("[\\S]"," ");
         System.out.println(c9);
         
         boolean d=Pattern.matches("[\\S]","k");
         System.out.println(d);
         
         
                }

}
