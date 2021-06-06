package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thang can tim");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("thang 2 co 28 ngay");
                break;
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("thang " + month + " co 31 ngay");
                break;
            default:
                System.out.println("thang nhap khong hop le");
                break;

        }
        System.out.print(month);
    }
}
