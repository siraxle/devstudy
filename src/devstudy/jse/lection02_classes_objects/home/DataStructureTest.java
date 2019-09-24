package devstudy.jse.lection02_classes_objects.home;

public class DataStructureTest {

    public static void main(String[] args) {
        DataStructure d = new Queue();
        for (int i = 0; i < 5; i++) {
            d.add(i);
        }
        System.out.println(d.toString());
        d.get();
        System.out.println(d.toString());

    }

}
