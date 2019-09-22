package devstudy.jse.lection01_classes_objects.home;

class Node{
    private Node next;
    private int value;
    public Node(int value){
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class Queue {

    private Node first;
    private Node last;
    private int size;

    public void add(int element) {
        if (size == 0){
            first = last = new Node(element);
            size++;
        } else {
            Node item = new Node(element);
            last.setNext(item);
            last = item;
            size++;
        }
    }
    public int get(){
        if (size == 1){
            int res = first.getValue();
            return res;
        } else {
            Node tempNode;
            int res = 0;
            int i = 0;
            while (i < size) {
                tempNode = first;
                res = tempNode.getValue();
            }
            return res;
        }
    }
    public int size(){
        return size;
    }

}
