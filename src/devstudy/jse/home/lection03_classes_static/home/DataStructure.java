package devstudy.jse.home.lection03_classes_static.home;

import java.util.Arrays;

import devstudy.jse.lection03_classes_static.DataSet;

/**
 *
 * @author devstudy
 * @see ..devstudy.net
 */
public abstract class DataStructure<T> {
    protected final DataSet<T> dataSet;

    public DataStructure(DataSet<T> dataSet) {
        super();
        this.dataSet = dataSet;
    }

    public void add(T element) {
        dataSet.add(element);
    }

    protected abstract int getCurrentIndex();

    public T get() {
        return dataSet.remove(getCurrentIndex());
    }

    public T peek() {
        return dataSet.get(getCurrentIndex());
    }

    public int size() {
        return dataSet.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    protected T[] toArray() {
        return dataSet.toArray();
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(toArray());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        DataStructure other = (DataStructure) obj;
        if (!Arrays.equals(toArray(), other.toArray())) {
            return false;
        }
        return true;
    }
}
