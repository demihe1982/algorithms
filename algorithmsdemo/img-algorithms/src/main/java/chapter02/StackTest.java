package chapter02;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args){
        Stack<String>  stack = new Stack<String>();
        stack.push("H");
        stack.push("e");
        stack.push("l");
        stack.push("l");
        stack.push("o");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
