package com.joshua;

import java.util.List;

public class FP01Squares {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 8, 7, 6, 12, 15);
        printAllSquaresOfNumbersInListFunctional(numbers);
        printEvenNumbersInListFunctional(numbers);
        printCubesOfOddNumbers(numbers);
    }


    private static void printAllSquaresOfNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
        .map(number -> number * number)
                .forEach(System.out::println);
        System.out.println("---------------------");
    }

   //mapping -x -> x * x
    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
        System.out.println("---------------------");

    }

    private static void printCubesOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
        System.out.println("---------------------");
    }
}
