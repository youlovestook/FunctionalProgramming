package com.joshua;

import java.util.List;

public class FP01Exercises {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10,11);
        List<String> courses = List.of("Spring","Spring Boot", "API", "Microservices","AWS",
                "PCF", "Azure", "Docker", "Kubernetes");

        printOddNumbersInListFunctional(numbers);
        printAllCourses(courses);
        printAllCoursesThatContainSpring(courses);
        printAllCoursesWithAtLeastFourLetters(courses);
        printNumberOfCharactersInEachCourseName(courses);
    }



    private static void printAllCoursesThatContainSpring(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
        System.out.println("----------------------------------------");
    }

    private static void printAllCoursesWithAtLeastFourLetters(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() > 3)
                .forEach(System.out::println);
        System.out.println("----------------------------------------");
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
        System.out.println("----------------------------------------");
    }


    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
        System.out.println("----------------------------------------");

    }

    private static void printNumberOfCharactersInEachCourseName(List<String> courses) {
        courses.stream()
                .map(course -> "course: "+ course + " -- " +  course.length())
                .forEach(System.out::println);
        System.out.println("----------------------------------------");
    }
}
