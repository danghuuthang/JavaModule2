package Colorable;

import Geomegic.Square;

public class ColorableSquare extends Square implements Colorable {
    public ColorableSquare (double side){
        super(side);
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
