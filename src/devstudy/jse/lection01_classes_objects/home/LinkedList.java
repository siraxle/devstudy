package devstudy.jse.lection01_classes_objects.home;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LinkedList {

    private Item first;
    private Item last;
    private int size;
    public void add(int element) {
        if (size == 0){
            first = last = new Item(element);
            size++;
        } else {
            Item item = new Item(element);
            last.setNext(item);
            item.setPrevious(last);
            last = item;
            size++;
        }
    }
    public int get(int index) {
        int temp = 0;
        if (index == 0){
            temp = first.getValue();
            return temp;
        } else {
            int i = 0;
            Item item = first.getNext();
            while (i < index){
                temp = item.getValue();
                item = item.getNext();
                i++;
            }
        }
        return temp;
    }
    public int remove(int index) {
        //remove first element
        if (index == 0){
            Item temp = first;
            first = temp.getNext();
            first.setNext(null);
            size--;
            System.out.println(temp.getValue());
            return temp.getValue();
        } else if (index <= size){
            if (index == size-1){
                Item temp = last;
                last.getPrevious().setNext(null);
                last.setPrevious(null);
                size--;
                System.out.println(temp.getValue());
                return temp.getValue();
            }
            Item temp = first;
            int i = 0;
            int res = 0;
            while (i <= index){
                if (i == index){
                    temp.getPrevious().setNext(temp.getNext());
                    temp.getNext().setPrevious(temp.getPrevious());
                    res = temp.getValue();
                    temp.setPrevious(null);
                    temp.setNext(null);
                }
                temp = temp.getNext();
                i++;
            }
            size--;
            System.out.println(res);
            return res;
        }
        return 0;
    }
    public int size(){
        return size;
    }
    public void clear(){
        size = 0;
        first = last = null;
    }
    public int[] toArray(LinkedList linkedList){
        Item item = linkedList.first;
        int[] array = new int[10];
        int i = 0;
        while (i <= size - 1){
            array[i] = item.getValue();
            item = item.getNext();
            i++;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

}
