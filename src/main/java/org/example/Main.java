package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {45, 32, 78, 12, 88, 2, 65, 34, 98, 7, 55, 23, 67, 41, 91};
        // Сортуємо масив
        Arrays.sort(array);

        // Виводимо початковий масив та відсортований масив
        System.out.println("Початковий масив: " + Arrays.toString(array));

        int searchNum = 34;
        // Знаходимо індекс введеного числа у відсортованому масиві
        int index = Arrays.binarySearch(array, searchNum);

        // Виводимо індекс числа у відсортованому масиві
        System.out.println("Індекс числа " + searchNum + " у відсортованому масиві: " + index);
    }
}