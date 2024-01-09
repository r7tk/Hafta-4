package Ornek1;

public class MyList<T> {
    T[] array;

    int capacity = 10;

    public MyList() {
        array = (T[]) new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    public int size() {
        int counter = 0;
        for (int i = 0 ; i < array.length ; i++){
        if (array[i] != null){
            counter++;
            }
        }
        return counter;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data){
        if (size() == capacity){
            capacity *= 2;
            T[] newArray =(T[]) new Object[capacity];
            System.arraycopy(array,0,newArray,0,capacity/2);
            array = newArray;

        }
        array[size()] = data;
    }

}

