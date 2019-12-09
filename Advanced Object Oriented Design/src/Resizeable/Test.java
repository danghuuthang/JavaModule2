package Resizeable;

public class Test {
    public static void main(String[] args) {
        ResizebleCircle circle = new ResizebleCircle(5);
        circle.resize(4);
        System.out.println(circle.getRadius());

        ResizealbeSquare square = new ResizealbeSquare(4);
        square.resize(50);
        System.out.println(square.getSide());

        ResizeableRectangle rectangle = new ResizeableRectangle(4,6);
        rectangle.resize(4);
        System.out.println("Width" + rectangle.getWidth()+ "Length"+rectangle.getLength());
    }
}
