package com.ehsan.pure_java.set.treeset;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * Created by Esi on 7/12/20.
 * For Java Collections
 */
class Stage3 {


    public static void main(String[] args) {

        TreeSet<Dog> treeDog = new TreeSet<>();
        treeDog.add(new Dog(43));
        treeDog.add(new Dog(21));
        treeDog.add(new Dog(10));
        treeDog.add(new Dog(2));

        Iterator iterator = treeDog.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    static class Dog implements Comparable<Dog> {
        int size;

        public Dog(int s) {
            size = s;
        }

        public String toString() {
            return size + "";
        }

        @Override
        public int compareTo(@NotNull Dog o) {
            return size - o.size;
        }
    }

}
