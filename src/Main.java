import java.time.LocalDate;

public class Main {
    public  static void checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println(year + " - висакосный год");
            } else if (year % 400 == 0) {
                System.out.println(year + " - висакосный год");
            } else if (year % 100 == 0) {
                System.out.println(year + " - не висакосный год");
            }
        } else {
            System.out.println(year + " - не висакосный год");
        }
    }
    public static void printDowloadOS(int clientOS, int yearOS){
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && yearOS < currentYear){
            System.out.println("Установите облегченную " +
                    "версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && yearOS == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && yearOS < currentYear) {
            System.out.println("Установите облегченную " +
                    "версию приложения для Android по ссылке");
        } else if (clientOS == 1 && yearOS == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void chekDeliveryDistance(int deliveryDistance) {
        int dayDelivery = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + dayDelivery);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            dayDelivery++;
            System.out.println("Потребуется дней: " + dayDelivery);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            dayDelivery = dayDelivery + 2;
            System.out.println("Потребуется дней: " + dayDelivery);
        }
    }

    public static void main(String[] args) {
        System.out.println("Домашнее задание к уроку \"Методы\"");
//        Задание 1
        System.out.println("Задание 1");
        int year = 2100;
        checkLeapYear(year);

//        Задание 2
        System.out.println("Задание 2");
        int clientOS = 0;
        int yearOS = 2021;
        printDowloadOS(clientOS, yearOS);

//        Задание 3
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        chekDeliveryDistance(deliveryDistance);
    }
}