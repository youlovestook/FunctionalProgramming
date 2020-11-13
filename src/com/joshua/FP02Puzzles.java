package com.joshua;

import java.util.List;

public class FP02Functional {

    public static void main(String[] args) {
        // write your code here
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        int sum = addListStructured(numbers);
        System.out.println(sum);
        System.out.println("-----------------------------------");

    }

    private static int sumTheNumbers(int a, int b) {
        return a + b;
    }

    private static int addListStructured(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0,Integer::sum );
    }


}
