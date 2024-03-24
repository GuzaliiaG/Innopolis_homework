package lesson_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Даны три вещественных числа a,b,c.
        // Проверить:
        // 1. выполняется ли неравенство a<b<c;
        // 2. выполняется ли неравенство b>a>c
        System.out.println("Введите первое число (а)");
        Scanner sc1 = new Scanner(System.in);
        double var_a = sc1.nextDouble();
        System.out.println("Введите второе число (b)");
        Scanner sc2 = new Scanner(System.in);
        double var_b = sc2.nextDouble();
        System.out.println("Введите третье число (c)");
        Scanner sc3 = new Scanner(System.in);
        double var_c = sc3.nextDouble();
        if (var_a < var_b && var_b < var_c) {
            System.out.println("Неравенство a<b<c выполняется");
        } else {
            System.out.println("Неравенство a<b<c не выполняется");
        }
        if (var_b > var_a && var_a > var_c) {
            System.out.println("Неравенство b>a>c выполняется");
        } else {
            System.out.println("Неравенство b>a>c не выполняется");
        }
    }
}
