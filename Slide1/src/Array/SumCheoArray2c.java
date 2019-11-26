package Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumCheoArray2c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int column;
        int [][] array;
        do {
            System.out.print("Enter a row:");
            row = scanner.nextInt();
            if (row > 10)
                System.out.println("Row does not exceed 10");
        } while (row > 10 );
        do {
            System.out.print("Enter a column:");
            column = scanner.nextInt();
            if (column > 10)
                System.out.println("Column does not exceed 10");
        } while (column > 10 );
        array=new int[row][column];
        System.out.println("Enter " + array.length + " i and " +
                array[0].length + " j: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element [" + (i) + "] ["+j+"] :");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Menu");
        System.out.println("1. Tong Duong cheo 1 tu phai sang trai");
        System.out.println("2. Tong Duong cheo 2 tu trai sang phai");
        System.out.println("3. Tong tat ca duong cheo ");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int sum=0;
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            if (i==j) {
                               sum+=array[i][j];
                            }
                        }
                    }
                    System.out.println("Result 1:"+ sum);
                    break;
                case 2:
                    int sum2=0;

                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            if (i+j == array.length-1){
                                sum2+= array[i][j];
                            }
                        }
                    }
                    System.out.println("Result 2:"+ sum2);
                    break;
                case 3:
                    int sum3=0;
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            if (i==j || (i+j==array.length-1)) {
                                sum3+=array[i][j];
                            }
                        }
                    }
                    System.out.println("Result 3:"+ sum3);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");

            }
        }
    }
}
