package ru.otus.java.basic.hw2;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        printPhrase(3, "Hello world");
        getElementsSum(new int[]{1, 3, 5, 7, 8, 7, 4, 3, 7, 6});
        fillArray(1, new int[10]);
        increaseArrayElements(2, new int[10]);
        getMoreHalf(new int[]{3, 2, 3, 1, 2, 3, 1});
    }

    /* Метод, принимающий в качестве аргументов целое число и строку, и печатающий в
    консоль строку указанное количество раз */
    public static void printPhrase(int count, String phrase) {
        for (int i = 0; i < count; i++){
            System.out.println(phrase);
        }
    }

    /* Метод, принимающий в качестве аргумента целочисленный массив, суммирующий все
    элементы, значение которых больше 5, и печатающий полученную сумму в консоль */
    public static void getElementsSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    /* Метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
    массив, метод должен заполнить каждую ячейку массива указанным числом */
    public static void fillArray(int value, int[] array){
        Arrays.fill(array, value);
    }

    /* Метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
    массив, увеличивающий каждый элемент массива на указанное число */
    public static void increaseArrayElements(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += value;
        }
    }

    /* Метод, принимающий в качестве аргумента целочисленный массив, и печатающий в
    консоль информацию о том, сумма элементов какой из половин массива больше */
    public static void getMoreHalf(int[] array) {
        int firstHalfSum = 0;
        int secondHalfSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                firstHalfSum += array[i];
            } else {
                secondHalfSum += array[i];
            }
        }

        if (firstHalfSum > secondHalfSum) {
            System.out.println("Первая половина больше");
        } else if (firstHalfSum < secondHalfSum) {
            System.out.println("Вторая половина больше");
        } else {
            System.out.println("Половины равны");
        }
    }
}