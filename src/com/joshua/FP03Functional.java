package com.joshua;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02SortDistinctFunctional {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<Integer> doubleNumbers = doubleNumbers(numbers);
        List<Integer> evenNumbers = evenNumbers(numbers);
        List<String> courses = List.of("Spring","Spring Boot", "API", "Microservices","AWS",
                "PCF", "Azure", "Docker", "Kubernetes");
        List<Integer> courseTitleLength = courseLengthList(courses);

        sortedListOfStrings(courses);
        System.out.println("----------------------------");
        sortedListOfStringsComparator(courses);
        System.out.println("----------------------------");
        sortedListOfStringsComparatorCustom(courses);
        System.out.println("----------------------------");
        System.out.println(doubleNumbers);
        System.out.println("----------------------------");
        System.out.println(evenNumbers);
        System.out.println("----------------------------");
        System.out.println(courseTitleLength);
        System.out.println("----------------------------");

    }

    private static List<Integer> courseLengthList(List<String> courses) {
        return courses.stream()
                .map(x -> x.length())
                .collect(Collectors.toList());
    }

    private static List<Integer> evenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
    }

    private static List<Integer> doubleNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

    }
    private static void sortedListOfStringsComparatorCustom(List<String> courses) {
        courses.stream()
                .sorted(Comparator.comparing(x -> x.length()))
                .forEach(System.out::println);
    }

    private static void sortedListOfStrings(List<String> courses) {
        courses.stream()
                .sorted()
                .forEach(System.out::println);
    }

    private static void sortedListOfStringsComparator(List<String> courses) {
        courses.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }


}
