package Geomegic;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle [] rectangles = new Rectangle[3];
        rectangles[0]= new Rectangle(5,5);
        rectangles[1]= new Rectangle();
        rectangles[2] = new Rectangle(4,5,"indigo",false);

        System.out.println("Pre-Sorted");
        for (Rectangle rectangle:rectangles){
            System.out.println(rectangle);
        }

        Comparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles,rectangleComparator);

        System.out.println("After-Sorted");
        for (Rectangle rectangle:rectangles) {
            System.out.println(rectangle);
        }
    }
}
