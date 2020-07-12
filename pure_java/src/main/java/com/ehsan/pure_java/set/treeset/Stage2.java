package com.ehsan.pure_java.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * Created by Esi on 7/12/20.
 * For Java Collections
 *
 * By running this code we will get some exception like this
 * "Exception in thread "main" java.lang.ClassCastException: com.ehsan.pure_java.TreeSet.Stage2$Dog cannot be cast to java.lang.Comparable"
 * Because HashSet want to sort this dogs, But the Dog class is not comparable
 */
class Stage2 {


    public static void main(String[] args) {

        TreeSet<Dog> treeDog = new TreeSet<>();
        treeDog.add(new Dog(43));
        treeDog.add(new Dog(21));
        treeDog.add(new Dog(10));
        treeDog.add(new Dog(2));

        Iterator iterator = treeDog.iterator();
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
