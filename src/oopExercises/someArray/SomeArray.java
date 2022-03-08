package oopExercises.someArray;

import java.util.Arrays;

public class SomeArray {
    public int size = 0;
    public int [] data = null;

    public void add(int element){
        if(this.data != null){
            if(size == data.length){
                data = Arrays.copyOf(data, data.length + 16);
            }

            takeUp(element);
        }
        else{
            data = new int[16];
            takeUp(element);
        }
    }

    private void takeUp(int e){
        data[size] = e;
        size++;
    }
}
