import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        Stack<String> myStringStack = new Stack<String>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        myStringStack.push("A");
        myStringStack.push("B");
        myStringStack.push("C");

        System.out.println(myStack);
        System.out.println(myStringStack);

        System.out.println("Popped element: " + myStack.pop());
        System.out.println("Popped element: " + myStack.pop());
        System.out.println("Popped element: " + myStack.pop());

        System.out.println("myStack after pop operations: " + myStack);
    }
}