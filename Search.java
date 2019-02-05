package com.hillel.lesson4;

public class Search {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 2, 4, 6, 7, 8, 9, 10, 12, 13, 15, 20, 21, 33, 67, 80, 120, 1001};

        int key = 10; //That's what we are looking for
        int min = 0;
        int max = intArray.length - 1;

        System.out.println(binarySearch(intArray, key, min, max));
    }

    private static boolean binarySearch(int[] intArray, int key, int min, int max) {

        int mid = (min + max) / 2;
        boolean respond = false;

        if (min > max) {
            respond = false;
        } else if (intArray[mid] == key) {
            respond = true;
        } else if (intArray[mid] < key) {
            respond = binarySearch(intArray, key, mid + 1, max);
        } else if (intArray[mid] > key) {
            respond = binarySearch(intArray, key, min, mid - 1);
        }
        return respond;
    }
}
