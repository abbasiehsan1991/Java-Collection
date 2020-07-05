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
class Stage3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        //We just cast our list into collection
        Collection<String> collection = list;

        //We just cast our list into iterable
        Iterable<String> iterable = list;

        //Let's just have a deep look into our iterable
        for (String element : iterable) {
            System.out.println("Iterable for=>>> Element is [" + element + "]");
        }


        //Create an iterator from our iterable
        Iterator<String> iterator = iterable.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Iterator while=>>> Element is [" + element + "]");
        }

        iterable.forEach(new Consumer<String>() {
            @Override
            public void accept(String element) {

                System.out.println("Iterable forEach=>>> Element is [" + element + "]");

            }
        });
    }
}
