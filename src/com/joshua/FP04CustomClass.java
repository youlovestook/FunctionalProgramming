package com.joshua;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FP04FunctionalProgramming {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        BiPredicate<Integer,Integer> simpleBiPredicate = (x , y) -> x > y ;

        BiFunction<Integer,Integer,String> simpleBiFunction = (x,y)-> {
            if (x >y){
                return "boogie";
            }
            else{
                return "oogie";
            }
        };

        System.out.println(simpleBiFunction.apply(4,5));

        boolean answer = simpleBiPredicate.test(30,4);
        System.out.println(answer);



    }
}
