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
            System.out.println(year + " ��� �������� ����������");
        else if (year % 4 == 0 && year % 100 > 0)
            System.out.println(year + " ��� �������� ����������");
        else if (year % 100 == 0)
            System.out.println(year + " ��� �� �������� ����������");
        else
            System.out.println(year + " ��� �� �������� ����������");
    }

    static void getOSAndYearToInstall(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear == LocalDate.now().getYear()) {
            if (clientOS == 0) {
                System.out.println("���������� ������ ���������� ��� iOS �� ������");
            } else {
                System.out.println("���������� ������ ���������� ��� Android �� ������");
            }
        } else if (clientDeviceYear < LocalDate.now().getYear()){
            if (clientOS == 0) {
                System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
            } else {
                System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
            }
        } else System.out.println("������� ��� �� ���������");
    }

    static void getDistanceToDelivery(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance > 100)
            System.out.println("����������");
        else if (deliveryDistance >= 60)
            System.out.println("����������� ����: " + (deliveryTime + 2));
        else if (deliveryDistance >= 20)
            System.out.println("����������� ����: " + (deliveryTime + 1));
        else if (deliveryDistance > 0)
            System.out.println("����������� ����: " + deliveryTime);
        else
            System.out.println("������������ ��������");
    }

    public static void getDuplicate(String str) {
        String duplicateMessage = "������ ���";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                duplicateMessage = "�����: " + str.charAt(i);
                break;
            }
        }
        System.out.println(duplicateMessage);
    }
}
