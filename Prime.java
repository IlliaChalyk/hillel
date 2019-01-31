/*
Написать метод который проверяет число простое или нет.
Если нет вывести все его делители.
 */

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) { //call method isPrime

        Scanner read = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int var = read.nextInt();
        isPrime(var);

    }

    public static void isPrime(int num) {

        int counter = 0;
        int[] div = new int[num];

        for (int i = 1; i <= num; i++) { //Finding divisors
            if (num % i == 0) {
                counter++;
                div[i - 1] = i;
                //System.out.println(i);
            }
        }

        if (counter == 2) { //check for prime
            System.out.println(num + " is prime");
        } else { //check for composite
            System.out.println(num + " is composite");
            System.out.println("List of divisors for " + num + ": ");
            for (int i = 0; i < div.length; i++) {
                if (div[i] != 0) {
                    System.out.println(div[i]);
                }
            }
        }
    }
}
