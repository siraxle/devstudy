package devstudy.jse.lection03_classes_static;

import net.devstudy.jse.lection03_classes_static.DynaArray;

/**
 *
 * @author devstudy
 * @see ..://devstudy.net
 */
public class Stack<T> extends DataStructure<T> {

    public Stack() {
        super(new DynaArray());
    }

    @Override
    protected final int getCurrentIndex() {
        return size() - 1;
    }

    @Override
    protected T[] toArray() {
        T[] array = (T[]) new Object[dataSet.size()];
        for (int i = 0; i < dataSet.size(); i++) {
            array[i] = dataSet.get(dataSet.size() - 1 - i);
        }
        return array;
    }
}