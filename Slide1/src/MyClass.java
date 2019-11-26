public class MyClass {
public static void swap(int [] myArr){
    int temp;
    temp=myArr[0];
    myArr[0]=myArr[1];
    myArr[1]=temp;

}

    public static void main(String[] args) {
        int [] myArr={5,10};
        System.out.println("Befor swap: a = " + myArr[0] + " b = " + myArr[1]);
        swap(myArr);
        System.out.println("After swap: a = " + myArr[0] + " b = " + myArr[1]);
    }
}
