package com.nighthawk.csa.abhijayfrqs;

import java.util.ArrayList;
import java.util.Arrays;

public class aFRQ6 {
    private static ArrayList<String> words = new ArrayList<>( Arrays.asList("ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"));

    public void printWords() {
        String answer;
        String result = "Words: ";
        for(String a : words) {
            if(a.substring(a.length() - 3, a.length()).equals("ing")) {
                result += ", " + a;
            }
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        aFRQ6 c = new aFRQ6();
        c.printWords();
    }
}