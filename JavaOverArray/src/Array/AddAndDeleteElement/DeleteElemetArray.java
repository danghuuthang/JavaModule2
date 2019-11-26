package Array.AddAndDeleteElement;
import java.util.Scanner;

public class DeleteElemetArray {
    public static void main(String[] args) {
        int size;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Enter the size ");
            size=scanner.nextInt();
            if (size>10)
                System.out.println("Size should not exceed 20");
        } while (size>10);
        int [] array = new int[size];
        int i=0;
        while (i<array.length) {
            System.out.print("Array[" + i + "]= ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.println("Enter the value X : ");
        int x=scanner.nextInt();
        int y=0;
        for (i=0;i<array.length;i++) {
            if (array[i]==x) {
                for (int j=i;j<array.length-1;j++){
                    array[j]=array[j+1];
                }
               y++;
            }
        }
        for (i=0;i<array.length-y;i++){
            System.out.print(array[i]+ " ");
        }

    }
}
