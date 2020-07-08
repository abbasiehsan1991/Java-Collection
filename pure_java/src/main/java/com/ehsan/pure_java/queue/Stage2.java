package com.ehsan.pure_java.queue;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Created by Esi on 7/5/20.
 * For Java Collections
 */
class Stage2 {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        priorityQueue.add(3);
        priorityQueue.add(5);
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(6);
        priorityQueue.add(2);

        System.out.println(priorityQueue);

        System.out.println("Peak()-> " + priorityQueue.peek());

        System.out.println("Poll()-> " + priorityQueue.poll());

        System.out.println("Peak()-> " + priorityQueue.peek());

    }
}
