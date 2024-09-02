package com.JavaCodingFromScratch;

import java.util.*;

public class Sets_q3 {
    public static Integer findFirstNonDuplicate(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> duplicates = new HashSet<>();

         for (Integer number : list) {
            if (!set.add(number)) {
                duplicates.add(number);
            }
        }

         for (Integer number : set) {
            if (!duplicates.contains(number)) {
                return number;
            }
        }
        return null;  
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 6, 4, 7, 8, 5);
        Integer firstNonDuplicate = findFirstNonDuplicate(list);
        System.out.println("First non-duplicate element: " + firstNonDuplicate);
    }
}
