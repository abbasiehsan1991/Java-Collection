package com.ehsan.pure_java.queue.deque;

/*
 * Created by Esi on 7/8/20.
 * For Java Collections
 */

import java.util.ArrayDeque;
import java.util.Deque;

class Stage1 {

    public static void main(String[] args) {

        Deque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.add("name");
        arrayDeque.addFirst("addFirst");
        arrayDeque.addLast("addLast");

        System.out.println(arrayDeque);

        /**
         * This method is used to retrieve the element at the head of the deque
         * But it doesn’t remove the element from the deque.
         * This method returns null if the deque is empty.
         */
        System.out.println("Peek()-> " + arrayDeque.peek());

        System.out.println(arrayDeque);

        arrayDeque.pop();
        arrayDeque.pollFirst();
        arrayDeque.pollLast();

        /**
         * Now our Deque is empty and by calling Poll() nothing will happen it just return null if deque is empty
         * This method is used to retrieve and remove the element at the head of the deque.
         * This method returns [NULL] if the deque is empty.
         */
        arrayDeque.poll();

        /**
         * Now by calling Pop() instead of Poll() we will get an exception.
         * This method is used to remove an element from the head and return it.
         */
        //arrayDeque.pop();

        System.out.println(arrayDeque);
    }
}
