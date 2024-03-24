package lesson_4;

import java.util.Random;

//Дан массив.
// Определить:
// 1.количество максимальных элементов в массиве;
// 2.количество минимальных элементов в массиве.
public class Task3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(3, 10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-50, 50);
        }
        int max = array[0];
        int min = array[0];
        int numMax = 0;
        int numMin = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] >= max) {
                if (array[i] > max) {
                    max = array[i];
                    numMax = 1;
                } else {
                    numMax += 1;
                }
            }
            if (array[i] <= min) {
                if (array[i] < min) {
                    min = array[i];
                    numMin = 1;
                } else {
                    numMin += 1;
                }
            }
        }
        System.out.printf("""

                        Максимальное значение масива равно %d
                        Количество максимальных элементов равно %d
                        Минимальное значение масива равно %d
                        Количество минимальных элементов равно %d""",
                max, numMax, min, numMin);
    }
}
