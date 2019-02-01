package com.hillel.lesson3;

public class EvenThenOdd {
    public static void main(String[] args) {

        int[] array = {2, 5, 2, 6, 3, 8, 6, 3, 7};
        sortEvenOdd(array);
    }

    private static void sortEvenOdd(int[] arr) {

        int[] sorted = new int[arr.length];
        int evenCounter = 0;
        int oddCOunter = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                sorted[evenCounter] = arr[i];
                evenCounter++;
            } else {
                sorted[oddCOunter] = arr[i];
                oddCOunter--;
            }
        }
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }
}

