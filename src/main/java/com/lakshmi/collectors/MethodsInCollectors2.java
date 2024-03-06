package com.lakshmi.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class MethodsInCollectors2 {

    public static void main(String[] args) {
        var list = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight","Nine");
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        // 1.Creating list: toList() , toSet(),
              list.parallelStream().collect(Collectors.toList()).forEach(System.out::println);

        // 2. Creating specific collection: toCollection(),
              var linkedList = list.stream().map(st -> st.toUpperCase()).collect(Collectors.toCollection(LinkedList::new));
             System.out.println(linkedList);

        // 4. Finding minimum value: minBy(),
            var first = num.stream().min(Comparator.naturalOrder()).stream().findFirst();
            var i = num.stream().collect(Collectors.minBy(Comparator.reverseOrder())).get();
            System.out.println("Minimum value in the collection "+first.get()+" "+i);

        // 5. Find the maximum value,
            var i1 = num.parallelStream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
            System.out.println("Maximum value in the list "+i1);

        // 6. Partitioning a list: partitioningBy(),
             var collect3 = num.stream().collect(Collectors.partitioningBy(n -> n > 2));
            System.out.println(collect3);

        // 7. Creating unmodifiable list: toUnmodifiableList(),
            var collect4 = num.stream().collect(Collectors.toUnmodifiableList());
//             System.out.println(collect4.add(1));           // Exception in thread "main" java.lang.UnsupportedOperationException

        //  8. Joining elements: joining(),
            var strJoin = num.stream().map(n -> n.toString()).collect(Collectors.joining(",", "[", "]"));
            System.out.println(strJoin);
    }
}
