package com.ehsan.pure_java.queue.priorityqueue;


import java.util.PriorityQueue;

/*
 * Created by Esi on 7/5/20.
 * For Java Collections
 */
class Stage2 {
    /**
     *Exception in thread "main"
     *java.lang.ClassCastException: com.ehsan.pure_java.queue.priorityqueue.Stage2$Employee cannot be cast to java.lang.Comparable
     *
     * Science the PriorityQueue needs to update it's items, So it's items must be comparable
     */
    public static void main(String[] args) {

        PriorityQueue<Employee> employees = new PriorityQueue<>();
        employees.add(new Employee("John" , 100));
        employees.add(new Employee("Jack" , 120));
    }

    static class Employee{
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }
}
