package com.lakshmi.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class MethodsInCollectors2 {

    public static void main(String[] args) {

        // 1.Creating list: toList() , toSet(),
        var list = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight");
            list.parallelStream().collect(Collectors.toList()).forEach(System.out::println);
    }
}
