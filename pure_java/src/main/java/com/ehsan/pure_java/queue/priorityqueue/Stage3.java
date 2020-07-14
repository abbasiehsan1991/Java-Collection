package com.ehsan.pure_java.queue.priorityqueue;


import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.PriorityQueue;

/*
 * Created by Esi on 7/5/20.
 * For Java Collections
 */
class Stage3 {
    /**
     * Exception in thread "main"
     * java.lang.ClassCastException: com.ehsan.pure_java.queue.priorityqueue.Stage2$Employee cannot be cast to java.lang.Comparable
     * <p>
     * Science the PriorityQueue needs to update it's items, So it's items must be comparable
     */
    public static void main(String[] args) {

        PriorityQueue<Employee> employees = new PriorityQueue<>();
        employees.add(new Employee("George", 150));
        employees.add(new Employee("John", 100));
        employees.add(new Employee("Jack", 120));
        employees.add(new Employee("Mike", 900));

/*        for (Employee employee : employees)
            System.out.println(employees.remove(employee));*/

        Iterator iterator = employees.iterator();
        while (iterator.hasNext())
           System.out.println(employees.remove());

    }

    static class Employee implements Comparable<Employee> {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        @Override
        public int compareTo(@NotNull Employee o) {
            if (salary > o.salary)
                return 1;
            else if (salary == o.salary)
                return 0;
            else return -1;
        }
    }
}
