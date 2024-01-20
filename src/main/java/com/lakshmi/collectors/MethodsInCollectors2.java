package com.lakshmi.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class MethodsInCollectors2 {

    public static void main(String[] args) {
        var list = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight");

        // 1.Creating list: toList() , toSet(),
            list.parallelStream().collect(Collectors.toList()).forEach(System.out::println);

        // 2. Creating specific collection: toCollection(),
        var linkedList = list.stream().map(st -> st.toUpperCase()).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(linkedList);
    }
}
