package devstudy.jse.lection02_inheritance_polymorph.home;

import java.util.Arrays;
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
    public int[] toArray(){
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            array[i] = list.get(list.size() - i - 1);
            //System.out.println(array[i]);
        }
        return array;
    }

    public int peek(){
        return this.list.get(size()-1);
    }

    @Override
    public String toString() {
        return "Stack{" +
                "list=" +
                Arrays.toString(this.toArray())
                +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stack stack = (Stack) o;
        return Objects.equals(this.list, stack.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}
