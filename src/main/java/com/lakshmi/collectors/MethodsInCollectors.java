package com.lakshmi.collectors;

import java.util.*;
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
            List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
            var collect1 = num.stream().filter(n -> n >= 2).collect(Collectors.toCollection(LinkedList::new));
            var collect2 = num.parallelStream().filter(n -> n > 5).collect(Collectors.toCollection(LinkedHashSet::new));
            System.out.println(collect1.getClass()+" "+collect);
            System.out.println(collect2.getClass()+" "+collect2);

        // 3. Counting elements: Counting(),
            var count = num.parallelStream().collect(Collectors.counting());
        System.out.println("Total elements present in the collection "+count+"  "+num.stream().count());
    }
}
