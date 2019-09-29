package devstudy.jse.lection03_classes_static.home;

public class LinkedList<T> extends DataSet<T> {

    private Item<T> first;
    private Item<T> last;

    @Override
    public void add(T element) {
        if (size == 0){
            first = last = new Item(element);
            size++;
        } else {
            Item<T> item = new Item<>(element);
            last.setNext(item);
            item.setPrevious(last);
            last = item;
            size++;
        }
    }

    @Override
    public T get(int index) {
        Item<T> current = findItem(index);
        return current != null ? current.getValue() : null;
    }

    private Item<T> findItem(int index) {
        int i = 0;
        Item<T> current = first;
        while (i < size) {
            if (i == index) {
                return current;
            } else {
                i++;
                current = current.getNext();
            }
        }
        return null;
    }

    @Override
    public T remove(int index) {
        Item<T> current = findItem(index);
        return current != null ? removeCurrent(current) : null;
    }

    private T removeCurrent(Item<T> current) {
        Item<T> prev = current.getPrevious();
        Item<T> next = current.getNext();
        if (next != null){
            removeCurrentFromNext(next, prev);
        }
        if (prev != null){
            removeCurrentFromPrevious(next, prev);
        }
        size--;
        if (size == 0) {
            first = last = null;
        }
        return current.getValue();
    }

    private void removeCurrentFromPrevious(Item<T> next, Item<T> prev) {
        prev.setNext(next);
        if (prev == null){
            first = next;
        }
    }

    private void removeCurrentFromNext(Item<T> next, Item<T> prev) {
        next.setPrevious(prev);
        if(prev == null){
            first = next;
        }
    }


    @Override
    public void clear(){
        super.clear();
        first = last = null;
    }

    @Override
    public T[] toArray() {
        T[] array = (T[]) new Object[size];
        int i = 0;
        Item<T> current = first;
        while (i < size) {
            array[i++] = current.getValue();
            current = current.getNext();
        }
        return array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        LinkedList that = (LinkedList) o;
        if (this.size() != that.size()) return false;
        T[] arr1 = this.toArray();
        Object[] arr2 = that.toArray();
        for (int i = 0; i < this.size(); i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
        //for (int i = 0; i < this.size(); i++){
         //   if (this.get(i) != linkedList.get(i)){
           //     return false;
            //}
       // }
        //return true;
    }

   private static class Item<E> {
        private Item<E> next;
        private E value;
        private Item<E> previous;
        Item(E value) {
            this.value = value;
        }
        Item<E> getNext() {
            return next;
        }
        void setNext(Item<E> next) {
            this.next = next;
        }
        E getValue() {
            return value;
        }
        Item<E> getPrevious() {
            return previous;
        }
        void setPrevious(Item<E> previous) {
            this.previous = previous;
        }
    }

}
