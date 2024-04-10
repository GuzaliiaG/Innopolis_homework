package projectPhoneList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainList {
    public static void main(String[] args) {
        List<Contact> listContact = new ArrayList<>();
        while (true) {
            switch (printMenu()) {
                case 1:
                    listContact.add(new Contact(inputName(), inputValue()));
                    printContact(listContact);
                    break;
                case 2:
                    System.out.println("Виберите номер контакта для редактирования");
                    printContact(listContact);
                    Scanner sc = new Scanner(System.in);
                    int choiceC = sc.nextInt();
                    if (choiceC > 0 && choiceC <= listContact.size()) {
                        System.out.println("Наберите:\n" +
                                "1 - Если хотите изменить имя контакта\n" +
                                "2 - Если хотите изменить номер телефона контакта\n" +
                                "3 - Если хотите изменить имя и номер телефона контакта\n" +
                                "4 - Если хотите изменить расположение контакта в списке\n");
                        Scanner sc1 = new Scanner(System.in);
                        int choiceOp = sc1.nextInt();
                        switch (choiceOp) {
                            case 1:
                                listContact.set((choiceC - 1),
                                        new Contact(inputName(), listContact.get(choiceC - 1).getValue()));
                                System.out.println("Имя контакта изменено");
                                printContact(listContact);
                                break;
                            case 2:
                                listContact.set((choiceC - 1),
                                        new Contact(listContact.get(choiceC - 1).getName(), inputValue()));
                                System.out.println("Номер контакта изменен");
                                printContact(listContact);
                                break;
                            case 3:
                                listContact.set((choiceC - 1), new Contact(inputName(), inputValue()));
                                System.out.println("Имя и номер контакта изменены");
                                printContact(listContact);
                                break;
                            case 4:
                                System.out.println("Введите номер на который Вы хотите передвинуть контакт");
                                Scanner sc2 = new Scanner(System.in);
                                int numberNew = sc2.nextInt();
                                if (numberNew > 0 && numberNew <= listContact.size() && numberNew != choiceC) {
                                    Contact interim = listContact.remove(choiceC - 1);
                                    listContact.add(numberNew - 1, interim);
                                } else if (numberNew == choiceC) {
                                    System.out.println("В данный момент контакт уже расположен в указаном месте");
                                } else {
                                    System.out.println("Контакт под таким номером не записан");
                                }
                                printContact(listContact);
                                break;
                            default:
                                System.out.println("Введен не корректный номер операции");
                                break;
                        }
                    } else {
                        System.out.println("Контакт под таким номером не записан");
                    }
                    break;
                case 3:
                    System.out.println("Виберите номер контакта для удаления");
                    printContact(listContact);
                    Scanner sc1 = new Scanner(System.in);
                    int choiceC1 = sc1.nextInt();
                    if (choiceC1 > 0 && choiceC1 <= listContact.size()) {
                        listContact.remove(choiceC1 - 1);
                        printContact(listContact);
                        break;
                    } else {
                        System.out.println("Контакт под таким номером не записан");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Введен не корректный номер операции");
                    break;
            }
        }

    }

    public static String inputName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя контакта");
        return sc.next();
    }

    public static String inputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер телефона контакта");
        return sc.next();
    }

    public static void printContact(List<Contact> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i).getName() + "  " + list.get(i).getValue());

        }
    }


    public static int printMenu() {
        System.out.println("Пожалуйста, выберите номер требуемой операции:\n" +
                "1 - Новый контакт\n" +
                "2 - Редактировать контакт\n" +
                "3 - Удалить контакт\n" +
                "4 - Выйти\n");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
