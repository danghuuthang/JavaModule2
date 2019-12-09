package Colorable;

import Geomegic.Square;

public class Testtt {
    public static void main(String[] args) {
        Square [] squares = new Square[3];
        squares[0]= new Square(4);
        squares[1]= new ColorableSquare(5.5);
        squares[2]=new Square(8.2);
        for (int i = 0; i < squares.length; i++) {
            System.out.println("\nSquare #" + (i + 1));
            System.out.println("Area: " + squares[i].getArea());
            if (squares[i] instanceof ColorableSquare) {
                ((ColorableSquare)squares[i]).howToColor();
            }
        }
    }
}
