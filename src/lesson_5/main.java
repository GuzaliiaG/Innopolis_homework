package lesson_5;

public class main {
    public static void main(String[] args) {
        //Создайте три экземпляра класса phone.
        Phone phone1 = new Phone("89604442233", "sumsung", 0.2);
        Phone phone2 = new Phone("89871112233", "apple", 0.3);
        Phone phone3 = new Phone("89113335566", "xiaomi", 0.4);
        System.out.println(phone1.getNumber());
        phone1.print();
        phone1.receiveCall("Мария");
        System.out.println(phone2.getNumber());
        phone2.print();
        phone2.receiveCall("Иван");
        System.out.println(phone3.getNumber());
        phone3.print();
        phone3.receiveCall("Анастасия");
    }
}