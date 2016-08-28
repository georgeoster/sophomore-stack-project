package stackassignment;

/**
 * last edited on 3/14/15
 * @author george oster
 */
public class TheStackItself {

    StackElement head = new StackElement();
    StackElement element;
    int size;

    
    public TheStackItself() {
        size = 0;
    }

    
    public void push(StackElement se) {
        element = se;
        element.setNext(head);
        head = element;
        size++;
    }

    
    public StackElement pop() {
        element = head;
        head = head.next;
        size--;
        return element;
    }

    
    public int getSize() {
        return size;
    }

    
    public boolean isEmpty() {
        boolean yesorno = false;

        if (size == 0) 
            yesorno = true;
        
        return yesorno;
    }

    
    public void displayStack() {
        System.out.println("here is the stack as it currently stands:");
        StackElement temp = head;

        while (temp.getElement().getName() != null) {
            System.out.println(temp.getElement().toString());
            temp = temp.getNext();
        }
    }

}
