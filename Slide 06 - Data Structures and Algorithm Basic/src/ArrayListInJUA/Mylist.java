package ArrayListInJUA;

import java.util.Arrays;

public class Mylist<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];
    public Mylist (){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public Mylist(int capacity){
    }
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }
    void add(int index, E element){
        if (index == elements.length){
            ensureCapa();
        }
        for (int i = 0; i <elements.length ; i++) {
            em
        }
    }

    }
}
