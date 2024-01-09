package Ornek3;


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
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data) {
        if (size() == capacity) {
            capacity *= 2;
            T[] newArray = (T[]) new Object[capacity];
            System.arraycopy(array, 0, newArray, 0, capacity / 2);
            array = newArray;

        }
        array[size()] = data;
    }


    public T get(int index) {
        if (index < 0 || array.length < index) {
            return null;
        } else {
            return array[index];
        }
    }

    public T remove(int index) {
        if (index < 0 || array.length < index) {
            return null;
        } else {
            T data = array[index];
            T[] newArray = (T[]) new Object[capacity];
            for (int i = 0; i < array.length; i++) {
                if (index < i) {
                    newArray[i - 1] = array[i];

                } else if (index > i) {
                    newArray[i] = array[i];
                }
            }
            array = newArray;
            return data;
        }


    }

    public T set(int index, T data) {
        if (index < 0 || array.length < index) {
            return null;
        } else {
            array[index] = data;
            return data;
        }
    }

    public String toString() {
        String list = "[";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                list += array[i];
                if (i + 1 != size()) {
                    list += ",";
                }
            }


        }
        list += "]";
        return list;
    }

    public int indexOf(T data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                return i;
            }

        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        for (int i = 0 ; i < array.length; i++ ){
            if (array[i] != null){
                return false;
            }

        }
        return true;
    }
    public T[] toArray(){
        T[] newArray = (T[]) new Object[size()];
        System.arraycopy(array,0,newArray,0,size());
    return newArray;
    }

    public void clear(){
        array = (T[]) new Object[capacity];
    }

    public MyList<T> subList(int start,int finish){
        MyList<T> mylist = new MyList<>(finish-start+1);
        for (int i = start ; i <= finish;i++){
            mylist.add(array[i]);
        }
            return mylist;

    }
    public boolean contains(T data){
        for (int i = 0 ; i < array.length; i++ ) {
            if (array[i] == data) {
                return true;
            }
        }
        return false;
    }
}





