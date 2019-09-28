package devstudy.jse.lection02_classes_objects.home;


import java.util.Arrays;
import java.util.Objects;

public class DynaArray {

    private int[] array;
    private int size;

    public DynaArray(){
        this.array = new int[10];
    }

   public void add(int element) {
        if(array == null) {
            clear();
        } else if (size == array.length) {
            int[] temp = array;
            array = new int[temp.length * 2];
            for(int i=0;i<temp.length;i++){
                array[i] = temp[i];
            }
        }
        array[size++] = element;
    }

    public int remove(int index){
       if (index < size){
           int value = array[index];
           for (int i = index; i < size - 1; i++){
               array[i] = array[i+1];
           }
           array[--size] = 0;
           return value;
       }
       return 0;
    }

   public int get(int index) {
        return array[index];
    }

   public int size(){
        return size;
    }

   public void clear(){
        size = 0;
        array = new int[10];
    }

   public int[] toArray(){
        return Arrays.copyOf(array, size);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynaArray that = (DynaArray) o;
        return this.size == that.size &&
                Arrays.equals(this.array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
