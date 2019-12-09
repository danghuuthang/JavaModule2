package Resizeable;

import Geomegic.Rectangle;

public class ResizeableRectangle extends Rectangle implements Resizeable {
    public ResizeableRectangle(double width, double length){
        super(width, length);
    }

    @Override
    public void resize(int percent) {
        double width = super.getWidth() * percent;
       double length = super.getLength()  * percent;
       super.setWidth(width);
       super.setLength(length);
    }
}
