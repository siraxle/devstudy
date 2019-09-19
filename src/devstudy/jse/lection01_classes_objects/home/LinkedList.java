package devstudy.jse.lection01_classes_objects.home;

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

        return 0;
    }
    public int size(){
        return size;
    }
    public void clear(){
        size = 0;
        first = last = null;
    }
    public int[] toArray(){
        return null;
    }

}
