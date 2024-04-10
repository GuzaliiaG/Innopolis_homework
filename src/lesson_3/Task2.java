package lesson_3;

import java.util.Scanner;

// Напечатать числа следующим образом:
// 25 25.5 24.8
// 26 26.5 25.8
// ...
// 35 35.5 34.8
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner sc1 = new Scanner(System.in);
        int number1 = sc1.nextInt();
        System.out.println("Введите второе число, которое должно быть больше первого");
        Scanner sc2 = new Scanner(System.in);
        int number2 = sc2.nextInt();
        while (number2 < number1) {
            System.out.println("Второе число должно быть больше первого, повторите ввод");
            Scanner sc3 = new Scanner(System.in);
            number2 = sc3.nextInt();
        }
        for (int i = number1; i <= number2; i++) {
            System.out.printf("%d %d.5 %d.8\n", i, i, i - 1);
        }

    }
}
