package com.lakshmi.queries;

import java.util.*;

public class EmpIMPL {

    public static void main(String[] args) {
        int empId;
         List<Employee> employeeList = new LinkedList<>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Bhaskar K", 25, "Male", "Sales And Marketing", 2015, 134500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(123, "Helen Theron", 39, "Female", "Infrastructure", 2002, 48000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Hari", 41, "Male", "Product Development", 2012, 305700.0));

        // Real Time Queries On employeeList,
        /**
         * @Author Naveen Wodeyar

        // 1 : How many male and female employees are there in the organization?
            var collect = employeeList.parallelStream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
            System.out.println(collect);
    
        // 2 : Print the name of all departments in the organization?
             employeeList.parallelStream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        // 3 : What is the average age of male and female employees?
            System.out.println("\n Average age of Employees");
            var collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
            System.out.println(collect);

        // 4 : Get the details of highest paid employee in the organization?
            System.out.println("\n Highest paid employee in the organization");
             var employee = employeeList.parallelStream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
            System.out.println(employee.getName()+",,"+employee.getSalary());

        // 5 : Get the names of all employees who have joined after 2015?
            System.out.println("\n Employees joined after 2015");
             employeeList.parallelStream().filter(emp -> emp.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);

        // 6 : Count the number of employees in each department?
            System.out.println("\n Employee count in each department");
            employeeList.parallelStream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
                        .entrySet()
                        .forEach(System.out::println);

        // 7 : What is the average salary of each department?
            System.out.println("\n Average salary of each department");
            employeeList.parallelStream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)))
                        .entrySet()
                        .forEach(System.out::println);

        // 8 : Get the details of youngest male employee in the product development department?
            System.out.println("\n Youngest Male employee in the product development department");
//            var employee = employeeList.stream().min(Comparator.comparing(Employee::getAge)).get();
//            System.out.println(employee.getName()+" "+employee.getAge());

                var juniorEmp = employeeList.parallelStream()
                .filter(emp -> emp.getDepartment()=="Product Development Department" && emp.getGender() == "Male")
                .min(Comparator.comparing(Employee::getAge))
                .get();
            System.out.println(juniorEmp.getName()+" "+juniorEmp.getAge());


        // 9 : Who has the most working experience in the organization?
            System.out.println("\n Seniormost employee in the organization");
            var employee = employeeList.parallelStream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))).get();
            System.out.println(employee.getName()+" "+employee.getYearOfJoining());

        // 10 : How many male and female employees are there in the sales and marketing team?
            System.out.println("\n Gender count in the department");
            employeeList.parallelStream()
                    .filter(emp -> emp.getDepartment().equalsIgnoreCase("Sales and Marketing"))
                    .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
                    .entrySet()
                    .forEach(System.out::println);

        // 11 : What is the average salary of male and female employees?
            System.out.println("\n Average salary of employees");
            employeeList.parallelStream()
                    .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)))
                    .entrySet()
                    .forEach(System.out::println);

        // 12 : List down the names of all employees in each department?
            System.out.println("\n Department employee names");
              var collect = employeeList.parallelStream().collect(Collectors.groupingBy(Employee::getDepartment));
            System.out.println(collect);


        // 13 : What is the average salary and total salary of the whole organization?
            System.out.println("Summary of department");
            var summaryStatistics = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
            System.out.println("\n Total salary of the whole organization:"+summaryStatistics.getSum());
            System.out.println("\n Max salary of the whole organization:"+summaryStatistics.getMax());
            System.out.println("\n Min salary of the whole organization:"+summaryStatistics.getMin());
            System.out.println("\n Average salary of the whole organization:"+summaryStatistics.getAverage());
            System.out.println("\n Total salary count of the whole organization:"+summaryStatistics.getCount());

         */
        // 14 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
            System.out.println("\n SeniorMost employee in the organization");
            var employee = employeeList.parallelStream().min(Comparator.comparing(Employee::getYearOfJoining)).get();
            System.out.println(employee.getName()+" "+employee.getDepartment());
    }
}
