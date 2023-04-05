package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");


        Stream<String> stream = list.stream();

        Stream<String> stream1 = Stream.<String>builder()
                .add("test")
                .build();

        System.out.println("----------------result-----------------");
        stream.forEach(n -> System.out.println(n));
        stream1.forEach(n -> System.out.println(n));
    }
}