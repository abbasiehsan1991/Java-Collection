package com.ehsan.pure_java.iterable;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Created by Esi on 7/5/20.
 * For Java Collections
 */
class IterableImpl implements Iterable<String> {

    private List<String> list = new ArrayList<>();

    public void add(String element){
        this.list.add(element);
    }

    @NotNull
    @Override
    public Iterator<String> iterator() {
        return this.list.iterator();
    }

}
