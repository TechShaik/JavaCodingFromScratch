package com.JavaCodingFromScratch;

import java.util.*;

public class Maps_q5 {

	public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(1, "apple");
        m.put(11, "cat");
        m.put(111, "banana");
        m.put(1111, "zebra");
        Map<Integer,String> tm=new TreeMap<>(m);
        System.out.println(tm);

	}

}
