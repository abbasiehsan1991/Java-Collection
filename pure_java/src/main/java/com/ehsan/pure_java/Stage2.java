package com.ehsan.pure_java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/*
 * Created by Esi on 7/5/20.
 * For Java Collections
 */
class Stage2 {

    public static void main(String[] args) {

        IterableImpl myIterable = new IterableImpl();
        myIterable.add("One");
        myIterable.add("Two");
        myIterable.add("Five");

        for (String element : myIterable) {
            System.out.println(element);
        }


        //we can get the iterator from our iterable
        Iterator<String> iterator = myIterable.iterator();


        myIterable.forEach(new Consumer<String>() {
            @Override
            public void accept(String element) {
                System.out.println(element);
            }
        });

    }
}
