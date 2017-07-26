package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

// @FunctionalInterface
public interface ArrayOperations {
    static double getAverage(int[] numbers){
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.print(n));
        IntStream.range(0, numbers.length)
                .average();
        return 0;

    }
}