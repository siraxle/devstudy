package devstudy.jse.lection02_inheritance_polymorph.home;

import java.util.Arrays;
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

    public int peek(){
        return list.get(0);
    }

    @Override
    public String toString() {
        return "Queue{" +
                Arrays.toString(list.toArray()) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Queue queue = (Queue) o;
        return list.equals(queue.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}