package com.ehsan.pure_java.queue.priorityqueue;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Created by Esi on 7/5/20.
 * For Java Collections
 */
class Stage1 {

    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(50);
        numbers.add(2);
        numbers.add(20);
        numbers.add(1);
        numbers.add(25);

        System.out.println(numbers);

        /**
         * By removing each element for the priority queue
         * The smallest integer is removed first followed by the next smallest integer and so on.
         */
        while (!numbers.isEmpty())
            System.out.println(numbers.remove());

    }
}
