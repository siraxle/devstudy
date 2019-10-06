package devstudy.jse.lection02_inheritance_polymorph;

import devstudy.jse.home.lection01_classes_objects.home.LinkedList;

public class Queue extends LinkedList {
    public int get(){
        return remove(0);
    }
}
