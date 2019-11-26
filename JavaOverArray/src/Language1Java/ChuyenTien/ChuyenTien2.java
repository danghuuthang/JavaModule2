package Language1Java.ChuyenTien;

import java.util.Scanner;

public class ChuyenTien2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, number2;
        System.out.println("Chọn loại tiền bạn muốn đổi sang VND");
        System.out.println("Nhấn phím 1 nếu muốn đổi USD --->VND ");
        System.out.println("Nhấn phím 2 nếu muốn đổi LAOs --->VND ");
        System.out.println("Nhấn phím 3 nếu muốn đổi ThaiLan --->VND ");
        System.out.println("Nhấn phím 4 nếu muốn đổi NhatBan --->VND ");
        System.out.println("Nhập số bạn chọn");
        number = scanner.nextInt();
        System.out.println("NHập số tiền bạn muốn đổi");
        number2 = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("số tiền USD-->VND là: " + number2*23000 +"VND");
                break;
            case 2:
                System.out.println("số tiền LAOs-->VND là: " + number2*13000 +"VND");
                break;
            case 3:
                System.out.println("số tiền ThaiLan-->VND là: " + number2*7000 +"VND");
                break;
            case 4:
                System.out.println("số tiền USD-->VND là: " + number2*17000 +"VND");
                break;
            default:
                System.out.println("ko tìm thấy");
        }
    }
}
