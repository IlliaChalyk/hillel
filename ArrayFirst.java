/*
Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно).
Вывести среднее арифметическое.
 */

public class ArrayFirst {
    public static void main(String[] args) {

        int[] RandomNum = new int[10];
        int sum = 0;

        for (int i = 0; i < RandomNum.length; i++) {
            RandomNum[i] = 10 + (int) (Math.random() * 11);
            System.out.println(RandomNum[i]);
            sum = sum + RandomNum[i];
        }

        System.out.println("Average is: " + (sum / RandomNum.length));
    }
}
