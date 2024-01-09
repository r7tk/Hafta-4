package java.org;

public class MyArrayList {
    private static final int INITIAL_CAPACITY = 16;
    private Integer[] array;
    private int size;

    public MyArrayList(Integer[] array, int size) {
        this.array = new Integer[INITIAL_CAPACITY];
        this.size = 0;
    }

    public MyArrayList() {
        this.array = new Integer[INITIAL_CAPACITY];
        this.size = 0;
    }


    public void add(Integer element){  //
        array [size] = element;
        size = size += 1;
    }
    public Integer get(int index){ //
        return array[index];

    }
    public int size(){
        return size;
    }
    }
