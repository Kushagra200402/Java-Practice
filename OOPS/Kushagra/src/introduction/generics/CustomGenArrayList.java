package introduction.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data; //creating array of object type
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE]; // initializing array
    }

    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copying original array's elements into the temporary array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp; //now data is pointing to the array double of its previous size
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T) data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    public boolean isEmpty(){
        return data.length == 0;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args){
//        ArrayList list = new ArrayList();

        CustomGenArrayList<Integer> list = new CustomGenArrayList<Integer>();
        list.add(4);
        list.add(7);
        list.add(12);
//        list.add("sgh"); //will throw error since we are adding string where the type of list is Integer

        for(int i=0; i<14; i++){
            list.add(3 * i);
        }
//        list.remove(0);
//        list.get(0);
//        list.set(1, 123);
//        list.size();
//        list.isEmpty();
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add("tws"); //It will throw error since list is of type integer but we are adding strings in it.
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("tws");
        list3.add("wired");
        list3.add("iem");
        System.out.println(list3);

    }
}
