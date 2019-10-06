package devstudy.jse.home.lection03_classes_static.home;

import devstudy.jse.lection03_classes_static.LinkedList;

/**
 *
 * @author devstudy
 * @see ..://devstudy.net
 */
public class Queue<T> extends DataStructure<T> {

    public Queue() {
        super(new LinkedList<T>());
    }

    public Queue(LinkedList<T> dataSet){
        super(dataSet);
    }

    @Override
    protected int getCurrentIndex(){
        return 0;
    }

}