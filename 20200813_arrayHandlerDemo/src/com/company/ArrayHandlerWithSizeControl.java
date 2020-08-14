package com.company;

import java.util.Arrays;

public class ArrayHandlerWithSizeControl {
    String[] array;
    int size=0;         // current array occupancy or the next element index

    public ArrayHandlerWithSizeControl(String[] array) {
        this.array = array;
        this.size=array.length;
    }
    public void add(String s){
        if(size>=array.length){                 //we need to enlarge the array
            int newLength = array.length+1;    // can be increased more than 1
            array=Arrays.copyOf(array,newLength);
        }
            array[size++]=s;
    }

    public String[] getArray() {
        array=Arrays.copyOfRange(array,0,size);
        return array;
    }

    public int getSize() {
        return size;
    }

    public void  remove(int index){
        if((index>=0&&size>0)&&(index<size)){
            if(index!=size-1) {
                System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
            }
            size--;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e"};
        ArrayHandlerWithSizeControl arrayHandler = new ArrayHandlerWithSizeControl(arr);
        arrayHandler.add("f");
        System.out.println(Arrays.toString(arrayHandler.getArray()));
        System.out.println("-------------------");
        arrayHandler.remove(4);
        System.out.println(Arrays.toString(arrayHandler.getArray()));
    }

}
