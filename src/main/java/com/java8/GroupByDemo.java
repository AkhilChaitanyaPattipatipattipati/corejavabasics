package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByDemo {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList (
                new Employee ( 1, "ranga", 10 ),
                new Employee ( 2, "raju", 20 ),
                new Employee ( 3, "kiran", 10 ),
                new Employee ( 4, "mohan", 10 ),
                new Employee ( 5, "hari", 20 ),
                new Employee ( 6, "kumar", 10 ),
                new Employee ( 7, "akhil", 30 )
        );

      /*  Map<Integer,List<Employee>> employeeListByDepartmentId=employees.stream().collect(Collectors.groupingBy(Employee::getDeptId));
        System.out.println(employeeListByDepartmentId);


        List<String> fruits =Arrays.asList("apple", "apple", "banana","apple", "orange", "banana", "papaya");
        Map<String,Long> fruitCountByName=fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(fruitCountByName);*/
        /*List<Employee> empList = employees.stream ().filter ( e -> e.geteName ().startsWith ( "h" ) )
                                          .collect ( Collectors.toList () );
        empList.forEach ( e -> System.out.println ( e ) );

    }*/

        List<Employee> empList = employees.stream ().filter ( e -> e.geteName ().contains ( "h" ) )
                                          .collect ( Collectors.toList () );
        empList.forEach ( e -> System.out.println ( e ) );
    }
}

