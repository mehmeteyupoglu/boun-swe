import java.util.*;
import java.io.*;

public class Reverse {
    public static void main(String[] args) {
        String word = "Hello";
        Stack<Character> myStack = new Stack<Character>();
        String reversed = "";

        for (int i = 0; i < word.length(); i++) {
            myStack.push(word.charAt(i));
        }

        while(!myStack.empty()){
            reversed+= myStack.pop();
        }

        System.out.println(reversed);
    }
}
