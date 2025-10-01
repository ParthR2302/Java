package JavaCollections.Programs.List;
import java.util.Stack;

/*
 * List of Methods:
 * - void add(element)
 * - void add(index, element)
 * - addFirst(ele), addLast(ele), addAll(collection), addAll(index, collection)
 * - int pop(). pops the top element and returns it.
 * - int peek(). Returns the top element
 * - bool isEmpty()
 * - int size()
 * - void clear()
 * - boolean contains(ele), boolean containsAll(collection)
 */

public class StackClass {

    static void printStack(Stack<?> st)
    {
        while(!st.empty())
        {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Double> st = new Stack<>();

        st.push(1.4D);
        st.push(2.34);

        if(st.empty()) System.out.println("Stack is empty");
        else System.out.println("Stack is not empty");

        System.out.println("Size of the stack is: " + st.size());

        System.out.println("First element of stack: " + st.pop());
        System.out.println("First element of stack after pop: " + st.peek());

        System.out.println("\nBreak 1 --------------------------------------------------------------------------------------------------\n");

        st.add(4.29);
        st.add(9.24);
        st.add(14.9);

        st.add(100d);
        st.add(2, 98.1423);

        StackClass.printStack(st);

        System.out.println("\nBreak 1 --------------------------------------------------------------------------------------------------\n");

        Stack<Integer> intSt = new Stack<>();

        intSt.push(1);
        intSt.push(2);
        intSt.push(3);
        intSt.push(4);
        intSt.push(5);
        intSt.push(6);
        intSt.push(7);
        intSt.push(8);
        intSt.add(2, 10);

        // StackClass.printStack(intSt);
        while(!intSt.empty()) {
            System.out.print(intSt.pop() + " ");
        }
        System.out.println();
    }
}
