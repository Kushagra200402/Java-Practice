package introduction.generics;
import introduction.interfaces.nested.A;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE]; // initializing array
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // copying original array's elements into the temporary array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp; //now data is pointing to the array double of its previous size
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
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

        CustomArrayList list = new CustomArrayList();
        list.add(4);
        list.add(7);
        list.add(12);

        for(int i=0; i<14; i++){
            list.add(3 * i);
        }
//        list.remove(0);
//        list.get(0);
//        list.set(1, 123);
//        list.size();
//        list.isEmpty();
        System.out.println(list);
//        Here we created custom ArrayList replicating the original one but problem with this is it will work only with Integers.
//        But this is not the case with the ArrayList. You can create an arraylist of any data type (even your own custom data type).
        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add("tws"); //It will throw error since list is of type integer but we are adding strings in it.
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("tws"); // Here you can add strings
        // So this way <> through which we can create any type of ArrayList, we can do it via Generics.
//        Here the problem is that we can add only integers in our custom ArrayList but what if want to add Strings or boolean to? Do we need to write same code for them too?
//        So If there is way to create just a template where we can pass any datatype so that we can do it via Generics.
//        It also helps in type safety means specifying the type while declaring the variable to instruct the user to enter only particular type of data
    }
}
