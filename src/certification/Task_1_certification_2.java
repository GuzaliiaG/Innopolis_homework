package certification;

import java.util.Scanner;
public class Task_1_certification_2 {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число");
        Scanner sc1 = new Scanner(System.in);
        int number1 = sc1.nextInt();
        System.out.println("Введите второе целое число, не равное первому");
        Scanner sc2 = new Scanner(System.in);
        int number2 = sc2.nextInt();
        while (number2 == number1) {
            System.out.println("Второе число не должно быть равно первому, повторите ввод");
            Scanner sc3 = new Scanner(System.in);
            number2 = sc3.nextInt();
        }
        System.out.println("Сумма чисел = " + (number1 + number2));
        System.out.println("Разница чисел = " + (Math.abs(number1 - number2)));
        System.out.print("Ряд цифр от минимального до максимального: ");
        for (int i = Math.min(number1, number2); i <= Math.max(number1, number2); i++) {
            System.out.print(i + " ");
        }
    }
}


