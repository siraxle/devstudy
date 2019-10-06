package devstudy.jse.home.lection02_inheritance_polymorph.home;

public class Item {

    private Item next;
    private int value;
    private Item previous;
    Item(int value) {
        this.value = value;
    }
    Item getNext() {
        return next;
    }
    void setNext(Item next) {
        this.next = next;
    }
    int getValue() {
        return value;
    }
    Item getPrevious() {
        return previous;
    }
    void setPrevious(Item previous) {
        this.previous = previous;
    }


}
