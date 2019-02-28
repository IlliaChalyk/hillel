package com.hillel.lesson5;

import com.hillel.lesson3.intlist.IntList;

import java.util.Arrays;

public class IntLinkedList implements IntList, Stack, Queue {
    //Stack________________
    @Override
    public void addFirst(int value) {
        add(0, value);

    }

    @Override
    public int peekFirst() {
        return first.value;
    }

    @Override
    public int removeFirst() {
        return getAndRemoveFirst();
    }
    //_____________________

    private static class Element {
        int value;
        Element previous;
        Element next;

        public Element(int value) {
            this.value = value;
        }
    }

    private int size = 0;
    private Element first;
    private Element last;

    @Override
    public void add(int value) {

        Element element = new Element(value);
        if (size == 0) {
            first = element;
            last = element;
        } else {
            last.next = element;
            element.previous = last;
            last = element;
        }
        size++;
    }

    //Queue____________________
    @Override
    public int peek() {
        return first.value;
    }

    @Override
    public int poll() {
        return getAndRemoveFirst();
    }
    //_________________________

    @Override
    public void clear() {
        size = 0;
        first = null;
        last = null;
    }

    @Override
    public boolean contains(int value) {

        int[] tmp = toArray();
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == value) {
                return true;
            }
        }
        return false;
    }


    @Override
    public int get(int index) {
        Element tmp = getElementByIndex(index);
        return tmp.value;
    }

    @Override
    public void set(int index, int element) {
        Element tmp = getElementByIndex(index);
        tmp.value = element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    //________________________________

    @Override
    public void remove(int index) {
        if (index >= size) {
            throw new IllegalArgumentException();
        }
        Element tmp = getElementByIndex(index);
        if (size == 1) {
            first = null;
            last = null;
        } else if (tmp == first) {
            first = first.next;
            first.previous = null;
        } else if (tmp == last) {
            last = last.previous;
            last.next = null;
        } else {
            Element before = tmp.previous;
            Element after = tmp.next;
            before.next = after;
            after.previous = before;
        }
        size--;
    }


    @Override
    public void add(int index, int element) {

        Element tmp = new Element(element);

        tmp.previous = getElementByIndex(index - 1);
        tmp.next = getElementByIndex(index);
        getElementByIndex(index - 1).next = tmp;
        getElementByIndex(index).previous = tmp;

        size++;
    }

    //________________________________

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    private int[] toArray() {

        int[] result = new int[size];
        int index = 0;
        Element tmp = first;

        while (tmp != null) {
            result[index] = tmp.value;
            index++;
            tmp = tmp.next;
        }
        return result;
    }

    private Element getElementByIndex(int index) {

        Element tmp = first;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    private int getAndRemoveFirst() {
        int tmp = first.value;
        remove(0);
        return tmp;
    }
}
