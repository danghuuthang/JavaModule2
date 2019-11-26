package Language1Java;

import java.util.Scanner;

public class LapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a year:");
        int year =scanner.nextInt();
        if (year < 0) {
            System.out.println("Invalil Input");
        } else
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        System.out.printf("%d is a leap year", year);
                    } else {
                        System.out.printf("%d is NOT a leap year", year);
                    }
                } else {
                    System.out.printf("%d is a leap year", year);
                }
            } else {
                System.out.printf("%d is NOT a leap year", year);
        }
        boolean isLeapYear = false;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
