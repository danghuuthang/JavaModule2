package PoinAndMoveablePoint;

import java.util.Arrays;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D(float x, float y) {
    }

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
