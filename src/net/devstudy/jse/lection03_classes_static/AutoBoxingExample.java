package net.devstudy.jse.lection03_classes_static;

public class AutoBoxingExample {
    public static void main(String[] args) {
        Object o = 5;
        System.out.println(o.getClass());
        int d = (int) o;
        System.out.println(d);
    }
}
