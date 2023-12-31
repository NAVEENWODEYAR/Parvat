package com.lakshmi.collectors;

import com.lakshmi.modal.EmpIMPL;
import com.lakshmi.modal.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodsInCollectors {

    public static void main(String[] args) {

    // 1.Creating list: toList()
        Employee e = new Employee();
        System.out.print(e.getId());

        var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        var collect = list.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.print(list.getClass()+" "+list);
        System.out.println("*************");
        System.out.println(collect.getClass()+" "+collect);
    }
}
