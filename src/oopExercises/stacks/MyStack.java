package oopExercises.stacks;

import java.util.Arrays;

public class MyStack {
    private int[] array = new int[16];
    private static int[] current;
    private int length = 0;
    private int[] max = new int[16];
    private int[] min = new int[16];

    public void push(int value) {
        if(array.length == length){
            array = Arrays.copyOf(array, array.length + 16);
            max = Arrays.copyOf(max, max.length + 16);
            min = Arrays.copyOf(min, min.length + 16);
        }

        if(length > 0 && value > max[length - 1]) {
            max[length] = value;
        }
        else if(length > 0 && value < max[length - 1]) {
            max[length] = max[length - 1];
        }
        else {
            max[0] = value;
        }

        if(length > 0 && value < min[length - 1]) {
            min[length] = value;
        }
        else if(length > 0 && value > min[length - 1]) {
            min[length] = min[length - 1];
        }
        else {
            min[0] = value;
        }

        if(length > 0) array[length] = value;
        else array[0] = value;

        length++;
    }

    public int pop(){
        int currentNum = array[length - 1];
        length--;
        return currentNum;
    }

    public int getMin() {
        return min[length - 1];
    }

    public int getMax() {
        return max[length - 1];
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        if(length == 0) return true;
        else return false;
    }

    public void print(){
        for(int a = 0; a < length; a++) {
            System.out.print(array[a] + " ");
        }
        System.out.println();
    }
}
