package CirleCylind;

public class MyClassCirle {
    public static void main(String[] args) {

        CircleMy circleMy = new CircleMy();
        System.out.println(circleMy);
        circleMy= new CircleMy(3.5);
        System.out.println(circleMy);
        circleMy = new CircleMy(4.5,"vietnam");
        System.out.println(circleMy);

        Cylinder cylinder= new Cylinder();
        System.out.println(cylinder);
        cylinder= new Cylinder(5);
        System.out.println(cylinder);
        cylinder = new Cylinder(5,5,"blue");
        System.out.println(cylinder);
    }

}
class CircleMy {
    private double radius=1;
    private String color="green";
    public CircleMy(){
    }
    public CircleMy(double radius){
        this.radius=radius;
    }
    public CircleMy(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public  double getArea(){
        return radius * radius* Math.PI;
    }
    public  double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public String toString(){
        return "A Circle1 with radius= "
                +getRadius()
                + " Color: "
                +getColor();
    }
}
class Cylinder extends CircleMy {
    private double height=1;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea() * height;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter() * height;
    }

    @Override
    public String toString() {
        return "A CirleCylind.Cylinder with height= "
                + getHeight()
                + super.toString();
    }
}
