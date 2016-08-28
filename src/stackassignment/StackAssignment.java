package stackassignment;

/**
 * last edited on 3/14/15
 *
 * @author george oster
 */
public class StackAssignment {

    public static void main(String[] args) {

        NewsPaper nyt = new NewsPaper("New York Times", "1683855", "New York", "NY", "0362-4331");
        NewsPaper lat = new NewsPaper("Los Angeles Times", "1231318", "Los Angeles", "CA", "0458-3035");
        NewsPaper wp = new NewsPaper("Washington Post", "960684", "Washington", "DC", "0190-8286");
        NewsPaper ct = new NewsPaper("Chicago Tribune", "957212", "Chicago", "IL", "1085-6706");
        NewsPaper pi = new NewsPaper("Philadelphia Inquirer", "705965", "Philadelphia", "PA", "0885-6613");

        StackElement first = new StackElement(nyt);
        StackElement second = new StackElement(lat);
        StackElement third = new StackElement(wp);
        StackElement fourth = new StackElement(ct);
        StackElement fifth = new StackElement(pi);

        TheStackItself mystack = new TheStackItself();

        mystack.push(first);
        mystack.push(second);
        mystack.push(third);
        mystack.push(fourth);
        mystack.push(fifth);

        System.out.println("First we will use the displayStack() method to show that the push() method worked.\n");

        mystack.displayStack();

        System.out.println("\nNow we will pop the first element off the stack.");

        StackElement popped = mystack.pop();

        System.out.println("\nThis is the element that was popped:  " + popped.getElement().toString());

        System.out.println("\nNow we will again use the displayStack() method to show that the pop worked.\n");

        mystack.displayStack();

    }

}
