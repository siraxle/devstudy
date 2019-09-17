package devstudy.jse.lection01_classes_objects.home;

import net.devstudy.jse.lection01_classes_objects.DynaArray;

import java.util.Arrays;

public class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray arr = new DynaArray();
        for(int i=0;i<23;i++){
            arr.add(i);
        }
        System.out.println(Arrays.toString(arr.toArray()));
    }
}
