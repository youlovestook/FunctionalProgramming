package com.joshua;

import java.util.List;

public class FP02Structured {

    public static void main(String[] args) {
        // write your code here
        List<Integer> numbers = List.of(12, 9, 8, 7, 6, 12, 15);
        printAllNumbersInListStructured(numbers);
        printEvenNumbersInListStructured(numbers);

    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        // how to loop the numbers? (traditional approach)
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        // how to loop the numbers? (traditional approach)
        System.out.println("-----------------------------------");
        for (int number : numbers) {
            // if even print number out
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        System.out.println("-----------------------------------");
    }
}
