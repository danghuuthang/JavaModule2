package Array.PraticaArray;

import java.util.Scanner;

public class SumRowArray {
    public static void main(String[] args) {
        int row;
        int column;
        int [][] array;
        Scanner scanner=new Scanner(System.in);
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
        System.out.println("Enter k:");
        int k=scanner.nextInt();
        int sum=0;
        for (int i=0;i<row;i++){
            sum+= array[i][k];
        }

        System.out.println("Result is:" + sum);
    }
}
