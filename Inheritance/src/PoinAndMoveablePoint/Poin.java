package PoinAndMoveablePoint;

import java.util.Arrays;

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
class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float [] Arr = new float[2];
        Arr[0]=getX();
        Arr[1]=getY();
        return Arr;
    }

    public Point2D(){

    }
    public  Point2D (float x, float y){
        this.x=x;
        this.y=y;

    }
    public String toString(){
        return "(x,y)= " + Arrays.toString(getXY());
    }
}
class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){
    }
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y, float z){
        super.setX(x);
        super.setY(y);
        this.z=z;
    }
    public float [] getXYZ() {
        float [] arr = new float [3];
        arr[0]=super.getX();
        arr[1]=super.getY();
        arr[2]=getZ();
        return arr;
    }
    @Override
    public String toString(){
        return "(x,y,z) = " + Arrays.toString(getXYZ());
    }
}
class MoveablePoint extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed= 0.0f;
    public MoveablePoint(){
    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint(float xSpeed, float ySpeed,float x , float y){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public float [] getSpeed(){
        float [] arr = new float[2];
        arr[0]=getxSpeed();
        arr[1]=getySpeed();
        return  arr;
    }
    @Override
    public String toString(){
        return "(x,y),speed = " + Arrays.toString(getSpeed())
                + " x,y = " +Arrays.toString(super.getXY());
    }
    public MoveablePoint move(){
    }
}
