package com.ehsan.pure_java.queue;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Created by Esi on 7/5/20.
 * For Java Collections
 */
class Stage1 {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue);

        /**
         * 	This method is used to view the head of queue without removing it. It returns Null if the queue is empty.
         */
        System.out.println("Peak()-> " + queue.peek());

        /**
         * This method removes and returns the head of the queue.
         * It throws NoSuchElementException when the queue is empty.
         */
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        //We will get an exception here because our queue is empty now
        //System.out.println(queue.remove());

        /**
         * This method removes and returns the head of the queue. It returns null if the queue is empty.
         * If we want to prevent this exception, we can use Poll() instead of remove()
         */
        System.out.println(queue.poll());

        System.out.println(queue);

    }
}
