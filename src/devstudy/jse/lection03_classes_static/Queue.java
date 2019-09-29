package devstudy.jse.lection03_classes_static;

import net.devstudy.jse.lection03_classes_static.LinkedList;

/**
 *
 * @author devstudy
 * @see ..://devstudy.net
 */
public class Queue<T> extends DataStructure<T> {

    public Queue() {
        super(new LinkedList());
    }
}