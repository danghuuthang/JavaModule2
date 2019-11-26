package Language1Java;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        System.out.println();
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 2:
                    for (int i=1;i<=5;i++){
                        System.out.println();
                        for (int j=1;j<=i;j++){
                            System.out.print("* ");
                        }
                    }
                    break;
                case 3:
                    for (int i=5;i>=1;i--){
                        System.out.println();
                        for (int j=1; j<=i;j++){
                            System.out.print("* ");
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
