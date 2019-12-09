package PoinAndMoveablePoint;

import java.util.Arrays;

public class MoveablePoint extends Point2D{
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
    public  MoveablePoint  move(){
        super.getX()+=this.getxSpeed();
        super.getY()+=this.getySpeed();
        return this;
    }
}
