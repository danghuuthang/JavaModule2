package PoinAndMoveablePoint;

public class Poin {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(2.0f,5.0f);
        System.out.println(point2D);
        point2D.setXY(5.0f,3.0f);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(2.0f,3.0f,4.0f);
        System.out.println(point3D);
        point3D.setXYZ(1.0f,2.0f,3.0f);
        System.out.println(point3D);

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(3,4);
        System.out.println( moveablePoint );
        moveablePoint = new MoveablePoint(3,4,3,3);
        System.out.println(moveablePoint);
    }
}
