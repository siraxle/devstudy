package devstudy.jse.lection01_classes_objects.home;

public class StackTest {
    public static void main(String[] args) {
        Stack s = new Stack();
        for (int i = 0; i < 5; i++) {
            s.add(i);
        }
        while (s.size() > 0) {
            System.out.print(s.get() + " ");
        }
        System.out.println();
    }
}
