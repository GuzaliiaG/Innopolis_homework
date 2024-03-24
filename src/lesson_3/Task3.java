package lesson_3;

import java.util.Scanner;

// Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для значений
// 1,2,...,10 фунтов (1 фунт = 453 г).
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите начальное значение веса для таблицы");
        Scanner sc1 = new Scanner(System.in);
        int weight1 = sc1.nextInt();
        System.out.println("Введите конечное значение веса для таблицы");
        Scanner sc2 = new Scanner(System.in);
        int weight2 = sc2.nextInt();
        while (weight2 < weight1) {
            System.out.println("Начальное значение должно быть меньше конечного, повторите ввод");
            Scanner sc3 = new Scanner(System.in);
            weight2 = sc3.nextInt();
        }
        for (int i = weight1; i <= weight2; i++) {
            System.out.printf("%d фунтов = %d грамм\n", i, 453 * i);
        }
    }
}
