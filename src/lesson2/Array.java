package lesson2;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Array {
    public static void main(String[] args) {
        Random random = new Random();

        MyArrayList<Integer> TestArr = new MyArrayList<>(100000); // Тестовый массив, на 100000.
        for (int i = 0; i < 100000; i++) {
            TestArr.add(random.nextInt(10));
        }
        System.out.println("_________________________________");
        System.out.println("Выводим не отсортированный массив");
        System.out.println(TestArr);
        System.out.println("Сортируем массив");

        TestArr.selectionSort();
        long start = System.nanoTime();
        TestArr.bubbleSort();
        long finish = System.nanoTime();
        long time = finish - start;
        System.out.println("Время сортировки Bubble: " + TimeUnit.NANOSECONDS.toMillis(time) + " ms");  // 7351 ms

        start = System.nanoTime();
        TestArr.selectionSort();
        finish = System.nanoTime();
        System.out.println("Сортировка выбором: " + TimeUnit.NANOSECONDS.toMillis(finish - start) + " ms"); // 4909 ms

        start = System.nanoTime();
        TestArr.insertionSort();
        finish = System.nanoTime();
        System.out.println("Сортировка вставкой: " + TimeUnit.NANOSECONDS.toMillis(finish - start) + " ms");  // 4 ms

//        System.out.println("Отсортированный тестовый массив методом Bubble");
//        System.out.println(testArr);

    }
}
