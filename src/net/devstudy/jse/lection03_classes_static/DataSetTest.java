package net.devstudy.jse.lection03_classes_static;

public class DataSetTest {

    public static void main(String[] args) {
        DataSet<Integer> ds = new DynaArray<>();
        ds.add(3);
        int v = ds.get(0);
    }
}
