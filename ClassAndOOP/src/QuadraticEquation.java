import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a:");
        double a=scanner.nextDouble();
        System.out.println("Enter the b:");
        double b=scanner.nextDouble();
        System.out.println("Enter the c:");
        double c=scanner.nextDouble();
        Acount acount = new Acount(a,b,c);
        if (acount.getDiscriminant()>=0) {
            if (acount.getDiscriminant()==0) {
                System.out.println(" The equation has one root " + acount.getRoot1());
            } else {
                System.out.println("The equation has two roots :" + acount.getRoot1() + " and " + acount.getRoot2());
            }
        } else  {
            System.out.println("The equation has no roots");
        }
    }

}
class Acount {
    double a,b,c;
    public Acount() {}
    public Acount(double a, double b , double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        double delta;
        delta = b*b-4*a*c;
        return delta;
    }
    public double getRoot1(){
        double r1;
        r1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
        return r1;
    }
    public double getRoot2(){
        double r2;
        r2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
        return r2;
    }
}
