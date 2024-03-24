package lesson_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // В чемпионате по футболу команде за выигрыш дается 3 очка, за проигрыш — 0, заничью — 1.
        // Известно количество очков, полученных командой за игру.
        // Определить словесный результат игры (выигрыш, проигрыш или ничья).
        System.out.println("Введите количество очков, полученных командой за игру");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        switch(score) {
            case 0:
                System.out.println("Проигрыш");
                break;
            case 1:
                System.out.println("Ничья");
                break;
            case 3:
                System.out.println("Выигрыш");
                break;
            default:
                System.out.println("Введенно не верное количество очков");
        }

    }
}
