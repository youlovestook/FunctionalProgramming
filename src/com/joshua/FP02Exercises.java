package com.joshua;

import java.util.List;

public class FP02Puzzles {

    public static void main(String[] args) {
        // write your code here
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        int sum = addListStructured(numbers);
        int max = findMaxInList(numbers);
        System.out.println("sum : " + sum);
        System.out.println("max : " + max);
        System.out.println("-----------------------------------");

    }

    private static int findMaxInList(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0,Integer::max);
    }

    private static int sumTheNumbers(int a, int b) {
        return a + b;
    }

    private static int addListStructured(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0,Integer::sum );
    }


}
