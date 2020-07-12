package com.ehsan.pure_java.set.treeset;

/*
 * Created by Esi on 7/12/20.
 * For Java Collections
 */

import java.util.TreeSet;

class Stage1 {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(12);
        treeSet.add(32);
        treeSet.add(24);
        treeSet.add(55);

        /**
         * We can iterate in HashSet by an iterator
         * We will see our inserted integers, But they're sorted now :)
         */
        for (Integer value : treeSet) {
            System.out.println(value);
        }

        /**
         *Below code is as same as above code,
         *Above enhanced code works like below code internally
         */
      /*
      Iterator iterator = treeSet.iterator();
      while (iterator.hasNext()) {
        System.out.println(iterator.next());
      }
      */
    }
}
