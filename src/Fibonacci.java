package org.challenges;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {
    private static void fibonacciStream(int limit) {
        String fibonacci = Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(limit)
                .map(arr -> String.valueOf(arr[0]))
                .collect(Collectors.joining(", "));
        System.out.printf("### Fibonacci Stream: %s\t\n", fibonacci);
    }

    private static int getFibonacciNth(int nth) {
        if (nth <= 1) return nth;
        return getFibonacciNth(nth - 1) + getFibonacciNth(nth - 2);
    }

    private static void fibonacciRecursive(int limit) {
        String fibonacci = IntStream.range(0, limit)
                .map(Fibonacci::getFibonacciNth)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.printf("### Fibonacci Recursive: %s\t\n", fibonacci);
    }

    private static void fibonacciLinear(int limit) {
        int firstNumber = 0;
        int secondNumber = 1;

        StringBuilder fibonacciSeq = new StringBuilder();
        for (int i = 0; i < limit; i++) {
            fibonacciSeq.append(firstNumber);
            if (i != limit - 1) fibonacciSeq.append(", ");
            int holder = secondNumber;
            secondNumber = firstNumber + secondNumber;
            firstNumber = holder;
        }
        System.out.printf("### Fibonacci Linear: %s\t\n", fibonacciSeq);
    }

    public static void main(String[] args) {
        fibonacciStream(8);
        fibonacciRecursive(8);
        fibonacciLinear(8);
    }
}
