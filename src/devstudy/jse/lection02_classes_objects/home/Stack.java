package devstudy.jse.lection02_classes_objects.home;

import java.util.Objects;

public class Stack extends DataStructure {
    private DynaArray list = new DynaArray();

    @Override
    public void add(int element) {
        list.add(element);
    }

    @Override
    public int get() {
        return list.remove(list.size() - 1);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stack stack = (Stack) o;
        return list.equals(stack.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        return "Stack{" +
                "list=" + list +
                '}';
    }
}
