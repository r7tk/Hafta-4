package Ornek2;


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



    public T get(int index){
        if (index < 0 || array.length < index ){
            return null;
        }else{
            return array[index];
        }
    }

    public T remove(int index){
        if(index < 0 || array.length < index){
            return null;
        }else{
            T data = array[index];
            T[] newArray = (T[]) new Object[capacity];
            for (int i = 0 ; i < array.length ; i++ ){
                if (index < i ){
                    newArray[i-1]= array[i];

                }else if (index > i){
                    newArray[i] = array[i];
                }
            }
            array = newArray;
            return data;
        }


    }
    public T set(int index, T data){
        if(index < 0 || array.length < index){
            return null;
        }else{
            array[index]= data;
            return data;
        }
    }
public String toString(){
        String list = "[";
        for (int i = 0; i < array.length ;i++){
            if (array[i] != null){
                list += array[i];
                if (i+1 != size()){
                    list += ",";
                }
            }


        }
        list+="]";
return list;
    }

}

