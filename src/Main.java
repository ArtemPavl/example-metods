public class Main {
    public  static boolean checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return  true;
            } else if (year % 400 == 0) {
                return  true;
            } else if (year % 100 == 0) {
                return false;
            }
        } else {
            return false;
        }
        return false;
    }

    public static void printLeanYears (boolean leanYears, int year){
        if (leanYears){
            System.out.println(year + " - висакосный год");
        }else {
            System.out.println(year + " - не висакосный год");
        }
    }

    public static boolean checkOperatingSystem(int clientOS) {
        if (clientOS == 0) {
            return true;
        } else if (clientOS == 1) {
            return  false;
        }
        return  false;
    }
    public static boolean cheakYearOS(int yearOS){
        int currentYear = 2022;
        return yearOS < currentYear;
    }

    public static void printDowloadOS(boolean clientOS, boolean yearOS){
        if (clientOS && yearOS){
            System.out.println("Установите облегченную " +
                    "версию приложения для iOS по ссылке");
        } else if (clientOS && !yearOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (!clientOS && yearOS) {
            System.out.println("Установите облегченную " +
                    "версию приложения для Android по ссылке");
        } else if (!clientOS && !yearOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int chekDeliveryDistance(int deliveryDistance) {
        int dayDelivery = 1;
        if (deliveryDistance < 20) {
            return dayDelivery;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return dayDelivery + 1;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return dayDelivery + 2;
        }
        return dayDelivery;
    }
    public static void printToDeliveryDistancce(int day){
        System.out.println("Потребуется дней: " + day);
    }

    public static void main(String[] args) {
        System.out.println("Домашнее задание к уроку \"Методы\"");
//        Задание 1
        System.out.println("Задание 1");
        int year = 2100;
        printLeanYears(checkLeapYear(year), year);

//        Задание 2
        System.out.println("Задание 2");
        int clientOS = 0;
        int yearOS = 2022;
        printDowloadOS(checkOperatingSystem(clientOS), cheakYearOS(yearOS));

//        Задание 3
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        printToDeliveryDistancce(chekDeliveryDistance(deliveryDistance));
    }
}