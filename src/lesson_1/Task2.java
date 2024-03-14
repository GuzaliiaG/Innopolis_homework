package lesson_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?
        System.out.println("Ведите радиус круга");
        Scanner sc1 = new Scanner(System.in);
        double radius = sc1.nextDouble();
        System.out.println("Ведите длину стороны квадрата");
        Scanner sc2 = new Scanner(System.in);
        double side = sc2.nextDouble();
        double circle = 2 * radius * Math.PI;
        double square = side * side;
        if (circle > square) {
            System.out.println("Площадь круга больше");
        } else if (circle == square) {
            System.out.println("Площади фигур равны");
        } else {
            System.out.println("Площадь квадрата больше");
        }
    }
}
