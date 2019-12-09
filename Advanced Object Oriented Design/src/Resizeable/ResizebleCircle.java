package Resizeable;

import Geomegic.Circle;

public class ResizebleCircle extends Circle implements Resizeable {
    public ResizebleCircle(double radius){
        super(radius);
    }
    @Override
    public void resize(int percent){
        double radius = (super.getRadius() * percent)/100;
        super.setRadius(radius);

    }
}
