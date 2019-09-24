package devstudy.jse.lection02_classes_objects.home;

import java.util.Objects;

public class Queue extends DataStructure{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Queue queue = (Queue) o;
        return Objects.equals(list, queue.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        return "Queue{" +
                "list=" + list +
                '}';
    }
}