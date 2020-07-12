package com.ehsan.pure_java.set.hashset;

/*
 * Created by Esi on 7/12/20.
 * For Java Collections
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Stage1 {
    public static void main(String[] args) {

        /**
         * There is no problem with unComparable [{@link Dog}]
         * Because hashSet will not sort our input
         */
        HashSet<Dog> hashSet = new HashSet<>();
        hashSet.add(new Dog(15));
        hashSet.add(new Dog(3));
        hashSet.add(new Dog(6));
        hashSet.add(new Dog(4));

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    static class Dog {
        int size;
        public Dog(int s) {
            size = s;
        }
        public String toString() {
            return size + "";
        }
    }

}
