package com.lakshmi.collectors;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodsInCollectors {

    public static void main(String[] args) {

        // 1.Creating list: toList() , toSet(),
        var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        var collect = list.stream().map(n -> n * n).collect(Collectors.toList());
        var set = list.stream().map(n -> n + n).collect(Collectors.toSet());
        System.out.println(list.getClass() + " " + list);
        System.out.println("*************");
        System.out.println(collect.getClass() + " " + collect);
        System.out.println("**************");
        System.out.println(set.getClass() + " " + set);


        // 2. Creating specific collection: toCollection(),
        var list1 = Arrays.asList("a", "b", "c", "d", "e", "f");
        list.parallelStream().map(s -> s.intValue()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
