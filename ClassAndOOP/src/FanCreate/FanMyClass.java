package FanCreate;

public class FanMyClass {
    private static final int SLOW=1;
    private static final int MEDIUM=2;
    private static final int FAST=3;
    private static boolean ON=false;
    private static double radius=5;
    private static String color="blue";

    public  boolean isON() {
        return ON;
    }

    public static double getRadius() {
        return radius;
    }

    public static String getColor() {
        return color;
    }

    public static int getSpeed() {
        return speed;
    }

    public void setON(boolean ON) {

        this.ON = ON;
    }

    public  void setRadius(double radius) {
        this.radius = radius;
    }

    public  void setColor(String color) {
        this.color = color;
    }

    private static int speed=SLOW;

    public  void setSpeed(int speed) {
        this.speed = speed;
    }

    public FanMyClass(){

    }
    public FanMyClass(boolean ON,int speed,double radius,String color){
        this.ON=ON;
        this.speed=speed;
        this.radius=radius;
        this.color=color;
    }
    public  String toString(){
        if (this.ON){
            return ("Fan is ON:\n Speed "+getSpeed()+  "\n Coler: " + getColor()+"\n Radius : "+ getRadius());
        } else {
            return ("Fan is OFF:\n Coler : " + getColor()+ "\n  radius: " + getRadius());
        }
    }
    public static void main(String[] args) {
        FanMyClass fan1 = new FanMyClass(ON,FAST,10,"yellow");
        System.out.println(fan1.toString());

        FanMyClass fan2 = new FanMyClass(false,SLOW,5,"blue");
        System.out.println(fan2.toString());
        fan2.setRadius(10);
        System.out.println(fan2.toString());
    }
}

