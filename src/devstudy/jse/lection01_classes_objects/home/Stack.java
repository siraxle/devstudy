package devstudy.jse.lection01_classes_objects.home;

import net.devstudy.jse.lection01_classes_objects.DynaArray;

public class Stack {
    private DynaArray list = new DynaArray();

    public void add(int element) {
        list.add(element);
    }

    public int get() {
        return list.remove(list.size() - 1);
    }

    public int size() {
        return list.size();
    }
}
