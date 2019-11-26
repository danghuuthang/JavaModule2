package Language1Java;

import java.util.Scanner;

public class Primeto100 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number You Want Print Prime:");
        int number=scanner.nextInt();
        System.out.println(" Prime in " + number +" number is:");
        int count=0;
        for (int i=2;i<i+1;i++){
            boolean check=true;
            int j=2;
            while (j<=Math.sqrt(i)){
                if (i % j==0) {
                    check=false;
                    break;
                }
                j++;
            }
            if (check) {
                System.out.print(i+ " ");
                count++;
            }
            if (count==number){
                break;
            }
        }
    }
}
