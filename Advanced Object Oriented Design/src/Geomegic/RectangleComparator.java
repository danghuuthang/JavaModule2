package Geomegic;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle r1, Rectangle r2){
        double diff = r1.getLength()*r1.getWidth() - r2.getLength()*r2.getWidth();
        if (diff <0){
            return -1;
        } else  if (diff == 0) {
            return 0;
        } else return 1;

    }
}
