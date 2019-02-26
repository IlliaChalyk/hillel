package com.hillel.lesson3.intlist;

public interface IntList {

    void add(int value);

    void clear();

    boolean contains(int value);

    int get(int index);

    boolean isEmpty();

    void set(int index, int element);

    int size();

    int remove(int index);

    void add(int index, int element);
}
