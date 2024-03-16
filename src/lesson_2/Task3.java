package lesson_2;

import java.util.Scanner;

// Даны стороны двух треугольников. Найти сумму их периметров и сумму их площадей.
// (Определить процедуру для расчета периметра и площади треугольника по его сторонам.)
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите длины трех сторон первого треугольника");
        Scanner sizes1 = new Scanner(System.in);
        double a1 = sizes1.nextDouble();
        double b1 = sizes1.nextDouble();
        double c1 = sizes1.nextDouble();
        if (!check(a1, b1, c1)) {
            System.out.println("Введено не верное соотношение сторон первого треугольника!");
            return;
        }
        System.out.println("Введите длины трех сторон второго треугольника");
        Scanner sizes2 = new Scanner(System.in);
        double a2 = sizes2.nextDouble();
        double b2 = sizes2.nextDouble();
        double c2 = sizes2.nextDouble();

        if (!check(a2, b2, c2)) {
            System.out.println("Введено не верное соотношение сторон второго треугольника!");
        } else {
            double perim1 = findPerimeter(a1, b1, c1);
            double square1 = findSquare(perim1, a1, b1, c1);
            double perim2 = findPerimeter(a2, b2, c2);
            double square2 = findSquare(perim2, a2, b2, c2);
            System.out.println("Сумма периметров треугольников:" + (perim1 + perim2));
            System.out.println("Сумма площадей треугольников:" + (square1 + square2));
        }
    }

    public static boolean check(double a, double b, double c) {
        return (a < (b + c) && b < (a + c) && c < (a + b));
    }

    public static double findPerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double findSquare(double perim, double a, double b, double c) {
        return Math.sqrt(perim * (perim - a) * (perim - b) * (perim - c));
    }
}
