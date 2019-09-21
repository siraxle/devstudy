package devstudy.jse.lection01_classes_objects.home;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for(int i=0;i<10;i++){
            linkedList.add(i);
        }
        linkedList.toArray(linkedList);
        //arr.get(3);
        linkedList.remove(3);
        linkedList.toArray(linkedList);
        linkedList.remove(0);
        linkedList.toArray(linkedList);

    }
}
