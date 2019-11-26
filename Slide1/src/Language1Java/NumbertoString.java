package Language1Java;

import java.util.Scanner;

public class NumbertoString {
    public static String numberIsAlpha(int n) {
        String str = "";

        while (n != 0) {
            switch (n) {
                case 1:
                    str = str + "one";
                    n = 0;
                    break;
                case 2:
                    str = str + "two";
                    n = 0;
                    break;
                case 3:
                    str = str + "three";
                    n = 0;
                    break;
                case 4:
                    str = str + "four";
                    n = 0;
                    break;
                case 5:
                    str = str + "five";
                    n = 0;
                    break;
                case 6:
                    str = str + "six";
                    n = 0;
                    break;
                case 7:
                    str = str + "seven";
                    n = 0;
                    break;
                case 8:
                    str = str + "eight";
                    n = 0;
                    break;
                case 9:
                    str = str + "nine";
                    n = 0;
                    break;
                case 10:
                    str = str + "ten";
                    n = 0;
                    break;
                case 11:
                    str = str + "eleven";
                    n = 0;
                    break;
                case 12:
                    str = str + "twelve";
                    n = 0;
                    break;
                case 13:
                    str = str + "thirtteen";
                    n = 0;
                    break;
                case 14:
                    str = str + "fourteen";
                    n = 0;
                    break;
                case 15:
                    str = str + "fifteen";
                    n = 0;
                    break;
                case 16:
                    str = str + "sixteen";
                    n = 0;
                    break;
                case 17:
                    str = str + "seventeen";
                    n = 0;
                    break;
                case 18:
                    str = str + "eighteen";
                    n = 0;
                    break;
                case 19:
                    str = str + "nineteen";
                    n = 0;
                    break;
            }
            if (n >= 20 && n < 30) {
                str = str + "twenty ";
                n = n - 20;
            } else if (n >= 30 && n < 40) {
                str = str + " thirty ";
                n = n - 30;
            } else if (n >= 40 && n < 50) {
                str = str + "fourty ";
                n = n - 40;
            } else if (n >= 50 && n < 60) {
                str = str + "fifty ";
                n = n - 50;
            } else if (n >= 60 && n < 70) {
                str = str + "sixty";
                n = n - 60;
            } else if (n >= 70 && n < 80) {
                str = str + "seventy ";
                n = n - 70;
            } else if (n >= 80 && n < 90) {
                str = str + "eighty ";
                n = n - 80;
            } else if (n >= 90 && n < 100) {
                str = str + "ninety ";
                n = n - 90;
            }
        }
        return str;
    }
    static String Hundred(int m)
    {
        String str = "";
        while (m != 0)
        {
            if (m >= 1 && m < 100)
            {
                str = str + numberIsAlpha(m);
                m = 0;
            }
            else {if (m >= 100 && m < 1000)
            {
                str = str + numberIsAlpha(m / 100);
                str = str + " hundred ";
                m = m % 100;
            }
            }
        }
        return str;
    }
    public  static void Display(int number)
    {
        if (number < 1 || number > 999)
        {
            System.out.println("chưa cập nhập");
        }
        else
        {
            System.out.println(Hundred(number));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        Display(number);
    }

}



