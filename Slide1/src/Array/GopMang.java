package Array;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] a = new int[5];
        int [] b= new int[5];
        int i = 0;
        while (i < a.length) {
            System.out.print("Enter element a " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
            i++;
        }
        i=0;
        while (i < b.length) {
            System.out.print("Enter element b " + (i + 1) + ": ");
            b[i] = scanner.nextInt();
            i++;
        }
        int size = a.length+b.length;
        int [] c = new int [size];
        for (i=0;i<a.length;i++) {
            c[i]=a[i];
        }
        for (int j=0;j<b.length;j++) {
            c[b.length+j]=b[j];
        }

        for (int element:c){
            System.out.print(element + " ");
        }
    }
}
