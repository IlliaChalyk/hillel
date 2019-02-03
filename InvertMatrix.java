package com.hillel.lesson3;

public class InvertMatrix {

    private static int[][] matrix = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
    };

    public static void main(String[] args) {
        invertTheMatrix(matrix);
    }

    //Inerts, reverses and shows a matrix
    private static void invertTheMatrix(int[][] matrix) {

        final int LINES = matrix.length;
        final int ROWS = matrix[0].length;

        int[][] reversed = new int[LINES][ROWS];

        //revers
        for (int i = 0; i < LINES; i++) {
            int counter = ROWS - 1;
            for (int j = 0; j < ROWS; j++) {
                reversed[i][counter] = matrix[i][j];
                counter--;
            }
        }
        for (int i = 0; i < LINES; i++) {
            for (int j = 0; j < ROWS; j++) {
                if (reversed[i][j] == 0) {
                    reversed[i][j] = 1;
                } else {
                    reversed[i][j] = 0;
                }
            }
        }

        //show
        for (int i = 0; i < LINES; i++) {
            for (int j = 0; j < ROWS; j++) {
                System.out.print(reversed[i][j] + " ");
                if (j == ROWS - 1) {
                    System.out.println();
                }
            }
        }
    }
}


