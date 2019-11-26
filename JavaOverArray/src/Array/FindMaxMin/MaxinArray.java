package Array.FindMaxMin;

import java.util.Scanner;

public class MaxinArray {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the size ");
            size=scanner.nextInt();
            if (size>20)
                System.out.println("Size should not exceed 20");
        } while (size >20);
        int [] array = new int[size];
        int i=0;
        while (i<array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        for ( int element:array) {
            System.out.print(element + "\t");
        }
        int max=array[0];
        int index=1;
        for (int element:array) {
            if (element>max) {
                max=element;
            }
        }
        System.out.println("The largest property value in the list is " + max );

    }
}
