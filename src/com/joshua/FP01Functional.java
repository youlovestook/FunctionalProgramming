package com.joshua;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
	// write your code here
        printAllNumbersInListFunctional(List.of(12,9,8,7,6,12,15));

        
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // how to loop the numbers? (traditional approach)
        for(int number:numbers){
            System.out.println(number);
        }
    }
}
