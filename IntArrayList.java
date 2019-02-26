package com.hillel.lesson3.intlist;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] array = new int[10];
    private int counter = 0;

    @Override
    public void add(int value) {
        array = checkSize(array);
        array[counter] = value;
        counter++;
    }

    @Override
    public void clear() {
        counter = 0;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < counter; i++) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public void set(int index, int element) {
        checkIndex(index);
        array[index] = element;

    }

    @Override
    public int size() {
        return counter;
    }

    //-----------------------------------------

    @Override
    public int remove(int index) {

        checkIndex(index);

        int[] tmpArray = new int[array.length];
        int tmpIndex = array[index];

        for (int i = 0; i < counter; i++) {
            if (i < index) {
                tmpArray[i] = array[i];
            } else {
                tmpArray[i] = array[i+1];
            }
        }
        counter--;
        array = tmpArray;
        return tmpIndex;
    }

    @Override
    public void add(int index, int element) {
        array = checkSize(array);

        int[] tmpArray = new int[array.length];

        for (int i = 0; i <= counter; i++) {
            if (i < index) {
                tmpArray[i] = array[i];
            } else if (i == index) {
                tmpArray[i] = element;
            } else {
                tmpArray[i] = array[i - 1];
            }
        }
        array = tmpArray;
        counter++;
    }

    //-----------------------------------------

    private void checkIndex(int index) {
        if (index >= counter) {
            throw new IndexOutOfBoundsException();
        }
    }

    private int[] checkSize(int[] array) {

        if (counter >= array.length) {
            int[] tmpArray = new int[array.length * (3 / 2 + 1)];
            System.arraycopy(array, 0, tmpArray, 0, counter);
            return tmpArray;
        } else {
            return array;
        }
    }

    @Override
    public String toString() {
        int[] tmpArray = new int[counter];
        System.arraycopy(array, 0, tmpArray, 0, counter);
        return Arrays.toString(tmpArray);
    }
    
}