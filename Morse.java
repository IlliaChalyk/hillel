package com.hillel.lesson6;

import java.util.HashSet;

public class Morse {
    public static void main(String[] args) {

        String[] th = {"gin", "zen", "gig", "msg"};
        System.out.println(toMorseCode(th));

    }

    public static int toMorseCode(String[] words) {

        StringBuilder morseWords;
        HashSet uniqueComb = new HashSet();

        for (int i = 0; i < words.length; i++) {

            words[i] = words[i].toLowerCase();
            morseWords = new StringBuilder();

            for (int j = 0; j < words[i].length(); j++) {

                switch (words[i].charAt(j)) {
                    case 'a':
                        morseWords.append(".-");
                        break;
                    case 'b':
                        morseWords.append("-...");
                        break;
                    case 'c':
                        morseWords.append("-.-.");
                        break;
                    case 'd':
                        morseWords.append("-..");
                        break;
                    case 'e':
                        morseWords.append(".");
                        break;
                    case 'f':
                        morseWords.append("..-.");
                        break;
                    case 'g':
                        morseWords.append("--.");
                        break;
                    case 'h':
                        morseWords.append("....");
                        break;
                    case 'i':
                        morseWords.append("..");
                        break;
                    case 'j':
                        morseWords.append(".---");
                        break;
                    case 'k':
                        morseWords.append("-.-");
                        break;
                    case 'l':
                        morseWords.append(".-..");
                        break;
                    case 'm':
                        morseWords.append("--");
                        break;
                    case 'n':
                        morseWords.append("-.");
                        break;
                    case 'o':
                        morseWords.append("---");
                        break;
                    case 'p':
                        morseWords.append(".--.");
                        break;
                    case 'q':
                        morseWords.append("--.-");
                        break;
                    case 'r':
                        morseWords.append(".-.");
                        break;
                    case 's':
                        morseWords.append("...");
                        break;
                    case 't':
                        morseWords.append("-");
                        break;
                    case 'u':
                        morseWords.append("..-");
                        break;
                    case 'v':
                        morseWords.append("...-");
                        break;
                    case 'w':
                        morseWords.append(".--");
                        break;
                    case 'x':
                        morseWords.append("-..-");
                        break;
                    case 'y':
                        morseWords.append("-.--");
                        break;
                    case 'z':
                        morseWords.append("--..");
                        break;
                    case ' ':
                        morseWords.replace(j, j, "");
                        break;
                }
            }
            uniqueComb.add(morseWords.toString());
            morseWords = null;
        }
        return uniqueComb.size();
    }
}