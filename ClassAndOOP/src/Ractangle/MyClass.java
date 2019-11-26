package Ractangle;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Ractangle ractangle = new Ractangle(width,height);
        System.out.println("Your Rectangle \n"+ ractangle.display());
        System.out.println("Perimeter of the Rectangle: "+ ractangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ ractangle.getArea());
    }
}
class Ractangle {
    double width,height;
    public Ractangle (){
    }
    public Ractangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return (this.width * this.height);
    }
    public  double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public String display () {
        return "Ractangle{"+"width=" + width+ "height="+height+"}";
    }
}
