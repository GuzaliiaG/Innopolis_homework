package lesson_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Даны два числа.
        // Если квадратный корень из второго числа меньше первого числа,
        // то увеличить второе число в пять раз.
        System.out.println("Введите первое число");
        Scanner sc1 = new Scanner(System.in);
        int number_1 = sc1.nextInt();
        System.out.println("Введите второе число");
        Scanner sc2 = new Scanner(System.in);
        int number_2 = sc2.nextInt();
        if ((Math.sqrt(number_2)) < number_1) {
            number_2 = number_2 * 5;
            System.out.println("Второе число увеличено в 5 раз и равно:" + number_2);
        }
    }
}
