package lesson_3;

import java.util.Scanner;

// Составить программу вывода любого числа любое заданное число раз.
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc1 = new Scanner(System.in);
        int number = sc1.nextInt();
        System.out.println("Введите количество выводов числа");
        Scanner sc2 = new Scanner(System.in);
        int iterat = sc2.nextInt();
        for (int i = 0; i < iterat; i++) {
            System.out.print(number + " ");
        }
    }
}
