package StopWatch;

public class StopW {
    public static void main(String[] args) {
        Time time = new Time();
        time.start();
        System.out.println(time.getElapsedTime());
        time.stop();
        System.out.println(time.getElapsedTime());
        double [] arr= new double[100000];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=(Math.random()*101);
        }
    }
}
