package lesson_2;

import java.util.Scanner;

public class Task4 {
    //Напечатать числа ввиде следующей таблицы:
    // 1 2...10
    // 1 2...10
    // 1 2...10
    // 1 2...10
    public static void main(String[] args) {
        System.out.println("Ведите число столбцов и число строк в таблице");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int m = num.nextInt();
        printNum(n, n, m);
    }

    public static void printNum(int a, int n, int m) {
        if (0 < n--) {
            System.out.print(a - n + " ");
            printNum(a, n, m);
        } else if (1 < m--) {
            n = a;
            System.out.println();
            printNum(a, n, m);
        }
    }

}


