package com.JavaCodingFromScratch;

import java.util.*;

public class Maps_q1 {

    public static void main(String[] args) {
         Map<Character, Integer> frequencyMap = new HashMap<>();

         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter a String: ");
        String input = scanner.nextLine();

         char[] characters = input.toCharArray();

         for (char c : characters) {
             if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                 frequencyMap.put(c, 1);
            }
        }

         System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " repeated " + entry.getValue() + " times");
        }

         
    }
}
