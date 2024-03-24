package lesson_4;

import java.util.Random;

//Дан массив. Вывести на экран сначала его неотрицательные элементы, затем отрицательные.
public class Task2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(3, 10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-50, 50);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\nНеотрицательные элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.print("\nОтрицательные элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
