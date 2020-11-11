package com.joshua;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
	// write your code here
        printAllNumbersInListStructured(List.of(12,9,8,7,6,12,15));

        
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        // how to loop the numbers? (traditional approach)
        for(int number:numbers){
            System.out.println(number);
        }
    }
}
