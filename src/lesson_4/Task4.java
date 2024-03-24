package lesson_4;

import java.util.Random;

// Составить программу:
// 1.нахождения минимального значения среди элементов любой строки двумерного массива;
// 2.нахождения максимального значения среди элементов любого столбца двумерного массива.
public class Task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] array = new int[r.nextInt(3, 10)][r.nextInt(3, 10)];
        int line = r.nextInt(array.length - 1);
        int min = array[line][0];
        int column = r.nextInt(array[0].length - 1);
        int max = array[0][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(-50, 50);
                System.out.print(array[i][j] + " ");
                if (i == line) {
                    if (array[i][j] < min) {
                        min = array[i][j];
                    }
                }
                if (j == column) {
                    if (array[i][j] > max) {
                        max = array[i][j];
                    }
                }
            }
            System.out.println();
        }
        System.out.printf("Минимальное значение среди элементов %d строки двумерного массива равно %d\n",
                (line + 1), min);
        System.out.printf("Максимальное значение среди элементов %d столбца двумерного массива равно %d\n",
                (column + 1), max);
    }
}
