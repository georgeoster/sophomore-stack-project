package stackassignment;

/**
 * last edited on 3/14/15
 *
 * @author george oster
 */
public class StackElement {

    NewsPaper theNews;
    StackElement next = null;

    
    public StackElement() {
        theNews = new NewsPaper();
    }

    
    public StackElement(NewsPaper n) {
        theNews = n;
    }

    
    public void setElement(NewsPaper n) {
        theNews = n;
    }

    
    public NewsPaper getElement() {
        return theNews;
    }

    
    public void setNext(StackElement se) {
        next = se;
    }

    
    public StackElement getNext() {
        return next;
    }

}
