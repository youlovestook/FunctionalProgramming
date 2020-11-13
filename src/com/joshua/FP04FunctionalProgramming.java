package com.joshua;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03BehavioralParameterization {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
                return    random.nextInt(1000);
        };

        UnaryOperator<Integer> unaryOperator = (x)-> 3*x;

        System.out.println(randomIntegerSupplier.get());

        System.out.println("----------------------------");

        System.out.println(unaryOperator.apply(3));

        System.out.println("----------------------------");

        numbers.stream()
                .filter(evenPredicate())
                .forEach(System.out::println);

        System.out.println("----------------------------");

        numbers.stream()
                .filter(oddPredicate())
                .forEach(System.out::println);

    }


    private static Predicate<Integer> evenPredicate() {
        return x -> x % 2 == 0;
    }


    private static Predicate<Integer> oddPredicate() {
        return x -> x % 1 == 0;
    }


}
