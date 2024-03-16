package lesson_2;

import java.util.Scanner;

//Составить процедуру, "рисующую" на экране горизонтальную линию из любого числа символов "*".
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите необходимое количество символов");
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        printStar(quantity);
    }

    public static void printStar(int quantity) {
        if (0 < quantity--) {
            System.out.print("* ");
            printStar(quantity);
        }
    }
}


