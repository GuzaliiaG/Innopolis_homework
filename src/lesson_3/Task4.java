package lesson_3;

import java.util.Scanner;

// Вычислить сумму 1 + 1/2 + 1/3 +...+ 1/n.
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите число n");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number == 0) {
            System.out.println("n не может быть равным нулю, повторите ввод");
            Scanner sc1 = new Scanner(System.in);
            number = sc1.nextInt();
        }
        double sum = 1;
        for (double i = 2; i <= number; i++) {
            sum += 1 / i;
        }
        System.out.printf("Сумма 1+1/2+1/3+...+1/n для n = %d равна %.4f", number, sum);
    }
}
