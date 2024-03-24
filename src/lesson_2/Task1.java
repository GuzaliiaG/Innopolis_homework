package lesson_2;

public class Task1 {
    //Составить процедуру, "рисующую" на экране горизонтальную линию из 10 символов "*"
    public static void main(String[] args) {
        printStar(10);
    }

    public static void printStar(int a) {
        if (a-- > 0) {
            System.out.print("* ");
            printStar(a);
        }
    }
}
