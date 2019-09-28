package net.devstudy.jse.lection03_classes_static;
import net.devstudy.jse.lection03_classes_static.DynaArray;

public class DataSetAnonymTest {

    public static void main(String[] args) {
        DynaArray<Integer> d1 = new DynaArray<Integer>();
        test(d1);
        DynaArray d2 = new DynaArray<Integer>() {
            @Override
            public void add(Integer element) {
                if(size() < 10) {
                    super.add(element);
                }
            }
        };
        test(d2);
    }

    private static void test(DynaArray<Integer> d) {
        System.out.println(d.getClass());
        for(int i=0;i<100;i++) {
            d.add(i);
        }
        System.out.println("Size="+d.size());
    }

}
