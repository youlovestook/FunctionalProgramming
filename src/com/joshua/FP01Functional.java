package com.joshua;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 8, 7, 6, 12, 15);
        printAllNumbersInListFunctional(numbers);
        printEvenNumbersInListFunctional(numbers);

    }


    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // how to loop the numbers? (traditional approach)
        // now focus on what to do
        numbers.stream().forEach(System.out::println);
        System.out.println("---------------------");
    }

    // accepts number as the parameter
    // is number%2 = 0
    // then return it back
    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        // how to loop the numbers? (traditional approach)
        // now focus on what to do
        numbers.stream()
                .filter(number -> number % 2 == 0)                    // define a lambda expression
                .forEach(System.out::println);

    }
}
