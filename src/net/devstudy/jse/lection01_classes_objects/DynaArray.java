package net.devstudy.jse.lection01_classes_objects;

import java.util.Arrays;

public class DynaArray {

    private int[] array;
    private int size;

    public DynaArray(){
        this.array = new int[10];
    }

   public void add(int element) {
        if(array == null) {
            clear();
        } else if (size == array.length) {
            int[] temp = array;
            array = new int[temp.length * 2];
            for(int i=0;i<temp.length;i++){
                array[i] = temp[i];
            }
        }
        array[size++] = element;
    }

    public int remove(int index){
        assert index >= 0 && index < this.array.length;
        int[] temp = new int[this.array.length - 1];
        int j;
        int result = 0;
        for (int i = 0; i < this.array.length; i++){
            if (i == index) {
                result = this.array[i];
                continue;
            }
            if (i < index){
                j = i;
            }else {
                j = i - 1;
            }
            temp[j] = this.array[i];
        }
        this.size--;
        this.array = temp;
        return result;
    }

   public int get(int index) {
        return array[index];
    }

   public int size(){
        return size;
    }

   public void clear(){
        size = 0;
        array = new int[10];
    }

   public int[] toArray(){
        return Arrays.copyOf(array, size);
    }

}
