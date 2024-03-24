package lesson_4;

import java.util.Scanner;

//Заполнить массив из двенадцати элементов 1,2,...12.
// Вывести элементы массива на экран в обратном порядке.
// Определить:
// 1.сумму всех элементов массива;
// 2.произведение всех элементов массива;
// 3.сумму квадратов всех элементов массива;
// 4.сумму шести первых элементов массива.
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Ввести количество цифр в массиве");
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        int[] array = new int[quantity];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
//        for (int i : array) {
//            System.out.printf("%d ", i);
//        }
//        System.out.println();
        int sum = 0;
        int product = 1;
        double sumSquare = 0;
        int summaSix = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[quantity - i - 1]);
            sum += array[i];
            product = product * array[i];
            sumSquare += Math.pow(array[i], 2);
            if (i < 6) {
                summaSix += array[i];
            }
        }
        System.out.printf("""

                        Сумма всех элементов массива = %d
                        Произведение всех элементов массива = %d
                        Сумма квадратов всех элементов массива = %.2f
                        Сумма шести первых элементов массива = %d
                        """,
                sum, product, sumSquare, summaSix);

    }
}
