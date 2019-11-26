package Array.FindMaxMin;

import java.util.Scanner;

public class FindMaxArray2 {
    public static void main(String[] args) {
        int size;
        int size1;
        int [][] array;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Size does not exceed 10");
        } while (size > 10 );
        do {
            System.out.print("Enter a size1:");
            size1 = scanner.nextInt();
            if (size1 > 10)
                System.out.println("Size does not exceed 10");
        } while (size1 > 10 );
        array=new int[size][size1];
        System.out.println("Enter " + array.length + " i and " +
                array[0].length + " j: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element [" + (i) + "] ["+j+"] :");
                array[i][j] = scanner.nextInt();
            }
        }
        int max=array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j] ;
                }
            }
        }
        System.out.println("Max in Array is : "+max);
    }
}
