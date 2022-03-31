package com.company;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	    getLeapYear(2022);
        getOSAndYearToInstall(1, 2022);
        getDistanceToDelivery(61);
        getDuplicate ("aabccddefgghiijjkk");
    }

    static void getLeapYear(int year) {
        if (year %100 == 0 && year %400 == 0 )
            System.out.println(year + " год является високосным");
        else if (year % 4 == 0 && year % 100 > 0)
            System.out.println(year + " год является високосным");
        else if (year % 100 == 0)
            System.out.println(year + " год не является високосным");
        else
            System.out.println(year + " год не является високосным");
    }

    static void getOSAndYearToInstall(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear == LocalDate.now().getYear()) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear < LocalDate.now().getYear()){
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else System.out.println("Будущее еще не наступило");
    }

    static void getDistanceToDelivery(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance > 100)
            System.out.println("Далековато");
        else if (deliveryDistance >= 60)
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        else if (deliveryDistance >= 20)
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        else if (deliveryDistance > 0)
            System.out.println("Потребуется дней: " + deliveryTime);
        else
            System.out.println("Некорректное значение");
    }

    public static void getDuplicate(String str) {
        String duplicateMessage = "Дублей нет";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                duplicateMessage = "Дубль: " + str.charAt(i);
                break;
            }
        }
        System.out.println(duplicateMessage);
    }
}
