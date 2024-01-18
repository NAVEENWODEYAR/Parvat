package com.lakshmi.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class MethodsInCollectors2 {

    public static void main(String[] args) {

        // 1.Creating list: toList() , toSet(),
        var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,0);
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
