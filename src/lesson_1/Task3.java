package lesson_1;

import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Дано двухзначное число.
        // Определить: остаток от деления десятков на единицы, результат деления единиц на десятки
        System.out.println("Введите двухзначное число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int units = number%10;
        int decade = number/10;
        if (number/100 > 0) {
            System.out.println("Введено неверное число, необходимо ввести двухзначное");
        } else if (number/10 == 0) {
            System.out.println("Введено неверное число, необходимо ввести двухзначное");
        } else {
            System.out.println("Остаток от деления десятков на единицы равен:" + (decade % units));
            System.out.println("Результат деления единиц на десятки равен:" + (units / decade));
        }
    }
}
