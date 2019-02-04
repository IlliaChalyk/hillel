package com.hillel.lesson4;


public class Robot {

    public static void main(String[] args) {
        String moves = "DDULLRUR";
        System.out.println(isInTheSamePlace(moves));
        System.out.println((moves.length()-1)/2);
    }

    private static boolean isInTheSamePlace(String moves) {

        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;

        char[] move = moves.toCharArray();

        for (int i = 0; i < move.length; i++) {

            //Used ASCII
            switch (move[i]) {
                case 85:
                    up++;
                    break;
                case 68:
                    down++;
                    break;
                case 76:
                    left++;
                    break;
                case 82:
                    right++;
            }
        }

        int horizontal = left - right;
        int vertical = up - down;

        if (horizontal == 0 & vertical == 0) {
            return true;
        } else {
            return false;
        }
    }
}