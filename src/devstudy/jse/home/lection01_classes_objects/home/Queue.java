package devstudy.jse.home.lection01_classes_objects.home;

public class Queue {
    private LinkedList list = new LinkedList();

    public void add(int element) {
        list.add(element);
    }

    public int get() {
        return list.remove(0);
    }

    public int size() {
        return list.size();
    }
}