package devstudy.jse.home.lection02_inheritance_polymorph.home;

public class DataStructureTest {

    public static void main(String[] args) {
        System.out.println("test Stack");
        DataStructure s1 = new Stack();
        DataStructure s2 = new Stack();
        for (int i = 0; i < 5; i++) {
            s1.add(i);
            s2.add(i);
        }
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s2.get()));
        System.out.println(s1.toString());
        System.out.println("Size = " + s1.size());
        s1.get();
        System.out.println(s1.toString());
        System.out.println("Size = " + s1.size());
        System.out.println(s1.isEmpty());
        System.out.println(s1.peek());

        System.out.println("\ntest Queue");
        DataStructure q = new Queue();
        for (int i = 0; i < 5000000; i++) {
            q.add(i);
        }
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s2.get()));
        System.out.println(q.toString());
        System.out.println("Size = " + q.size());
        q.get();
        System.out.println(q.toString());
        System.out.println("Size = " + q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
    }

}
