package Praticeheheh;

public class Practice {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red",false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);
        circle= new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(4.5,"indigo",false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.5, 3.8, "orange", false);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square(5.8, "yellow", false);
        System.out.println(square);

        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(3,4,5);
        System.out.println(triangle);
        triangle = new Triangle(6,8,10,"Red",false);
        System.out.println(triangle);
    }
}
class Shape {
    private String color="green";
    private boolean filled=true;
    public Shape(){ }
    public Shape ( String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString(){
        return "A Praticeheheh.Shape with color of "
                + getColor()
                +" and "
                + (isFilled()?" filled ":" not filled ");
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color,boolean filled){
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  double getArea(){
        return radius * radius* Math.PI;
    }
    public  double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "Circle with radius= "
                +getRadius()
                +" ,which is a subclass of "
                + super.toString();
    }
}
class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;
    public Rectangle(){}
    public Rectangle (double width, double length) {
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color,boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * this.length;
    }
    public double getPerimeter(){
        return 2 * (width + this.length);
    }
    @Override
    public String toString(){
        return "Rectangle with width="
                + getWidth()
                + " and length = "
                + getLength()
                + " which is a subclass of "
                + super.toString();
    }
}
class Square extends Rectangle {
    public Square(){
    }
    public Square(double size){
        super(size,size);
    }
    public Square (double size,String color, boolean filled) {
        super(size,size,color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double width){
        setWidth(width);
    }
    @Override
    public void setLength(double length){
        setLength(length);
    }
    @Override
    public String toString(){
        return "Square with side="
                + getSide()
                + " Area , peri : "
                + getArea()
                + " , "
                +getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }
}
class Triangle extends Shape {
    private double size1 = 1.0;
    private double size2 = 2.0;
    private double size3 = 3.0;
public Triangle(){
}
    public Triangle (double size1, double size2, double size3){
        this.size1=size1;
        this.size2=size2;
        this.size3=size3;
    }
public Triangle (double size1, double size2, double size3, String color, boolean filled){
    super(color,filled);
    this.size1=size1;
    this.size2=size2;
    this.size3=size3;
}

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
    public double getPerimeter() {
    return ((size1+size2+size3)/2);
    }
    public double getArea(){
        double p;
        p = getPerimeter();
    return Math.sqrt(p*(p-size1)*(p-size2)*(p-size3));
    }
    @Override
    public String toString(){
    return "(size1,size2,size3) = " +getSize1() + " , " + getSize2() + " , " +getSize3()
            + " Perimeter = " + getPerimeter()
            + " Area = " + getArea()
            + " Color = " + getColor()
            +  (super.isFilled()?" filler"  : " not filler ");
    }
}
