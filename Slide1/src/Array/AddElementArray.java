package Array;

import java.util.Scanner;

public class AddElementArray {
        public static void main(String[] args) {
            int i;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int [] arr = new int [n+1];
        System.out.print("Nhập các phần tử của mảng: \n");
        for ( i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhap Vi Tri Can Chen k=");
        int k=scanner.nextInt();
        System.out.print("Nhap gia tri can chen X:");
        int x=scanner.nextInt();
        for (i=arr.length-1; i>k;i--){
            arr[i]=arr[i-1];
        }
            arr[k]=x;
            for ( int element:arr) {
                System.out.print(element + "\t");
            }
    }
}
