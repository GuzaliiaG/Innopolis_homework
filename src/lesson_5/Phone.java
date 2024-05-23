package lesson_5;

public class Phone {
    //Создайте класс Phone, который содержит переменные number, model и weight.
    private final String number;
    private final String model;
    private final double weight;

    //Конструктор
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Добавьте в класс Phone методы: метод getNumber – возвращает номер телефона.
    public String getNumber() {
        return number;
    }

    // Выведите на консоль значения их переменных.
    public void print() {
        System.out.printf("Номер: %s\n" +
                        "Модель: %s\n" +
                        "Вес: %.2f\n",
                number, model, weight);
    }

    //    Добавьте в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
    //    Выводит на консоль сообщение “Звонит {name}”
    public void receiveCall(String name) {
        System.out.printf("Звонит %s\n\n", name);

    }
}
