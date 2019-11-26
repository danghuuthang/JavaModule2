package Language1Java.ChuyenTien;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        String CurentForm, CurentTo ,ValueCurent;
        System.out.println("các loại tiền chúng tôi có");
        System.out.println("USD , VND , LAO , NHATBAN");
        System.out.println("chon loại tiền bạn muốn đổi");
        CurentForm = scanner.nextLine();
        System.out.println("Chọn loại bạn muốn đổi ra");
        CurentTo=scanner.nextLine();
        System.out.println("NHập số tiền bạn muốn đổi");
        number = scanner.nextInt();
        ValueCurent=CurentForm +"_"+CurentTo;

        switch (ValueCurent){
            case "USD_VND":
                System.out.println("số tiền USD-->VND là: " + number*23000 +" VND");
                break;
            case "USD_LAO":
                System.out.println("số tiền USD-->LAO là: " + number*13000 +" LAO");
                break;
            case "USD_NHATBAN":
                System.out.println("số tiền USD-->NHATBAN là: " + number*7000 +" NHATBAN");
                break;
            case "USD_USD":
            case "VND_VND":
            case "LAO_LAO":
            case "NHATBAN_NHATBAN":
                System.out.println("Số tiền của bạn là: " + number);
                break;
            case "VND_USD":
                System.out.println("số tiền VND-->USD là: " + number/23000 + " USD");
                break;
            case "VND_LAO":
                System.out.println("số tiền VND-->LAO là: " + number/11000 + " LAO");
                break;
            case "VND_NHATBAN":
                System.out.println("số tiền VND-->NHATBAN là: " + number/13000 + " NHAT BAN");
                break;
            case "NHATBAN_USD":
                System.out.println("số tiền NHâtBAN-->USD là: " + number/3000 + " USD");
                break;
            case "NHATBAN_LAO":
                System.out.println("số tiền NhatBan-->LAO là: " + number*8000 + " LAO");
                break;
            case "NHATBAN_VND":
                System.out.println("số tiền NHATBAN-->VND là: " + number*13000 + " NHAT BAN");
                break;
            case "LAO_USD":
                System.out.println("số tiền Lao-->USD là: " + number/13000 + " USD");
                break;
            case "LAO_VND":
                System.out.println("số tiền LAOs-->VND là: " + number/8000 + " LAO");
                break;
            case "LAO_NHATBAN":
                System.out.println("số tiền Laos-->NHATBAN là: " + number/7000 + " NHAT BAN");
                break;
            default:
                System.out.println("ko tìm thấy");
        }
    }
}
