package ex_32_Collection_Framework_DSA.LIST;

import java.util.Stack;

public class Lab252_StackDemo {
    public static void main(String[] args) {

        // Create a stack to store String values
        Stack<String> s1 = new Stack<>();

        // Push elements onto the stack
        s1.push("python");
        s1.push("c#");
        s1.push("Java");

        // Print all elements in stack s1
        System.out.println("Initial stack s1: " + s1);

        // Peek: view the top element without removing it
        System.out.println("Top element in s1 (peek): " + s1.peek());

        // Pop: remove and return the top element
        System.out.println("Removed top element from s1 (pop): " + s1.pop());

        // Print stack s1 after pop operation
        System.out.println("Stack s1 after pop: " + s1);

        // Check if stack s1 is empty
        System.out.println("Is s1 empty? " + s1.empty());

        // Print the size of stack s1
        System.out.println("Size of s1: " + s1.size());

        // Search: get 1-based position of element "c#" from top (returns -1 if not found)
        System.out.println("Position of 'c#' from top: " + s1.search("c#"));

        // Iterate through stack s1 and print each element
        System.out.print("Iterating over s1: ");
        for (String item : s1) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Clear all elements from stack s1
        s1.clear();
        System.out.println("Stack s1 after clear: " + s1);


        // Create a stack to store Integer values
        Stack<Integer> intStack = new Stack<>();

        // Push elements onto intStack
        intStack.push(23);
        intStack.push(43);
        intStack.push(53);

        // Print all elements in intStack
        System.out.println("Initial integer stack: " + intStack);

        // Peek: view the top element without removing it
        System.out.println("Top element in intStack (peek): " + intStack.peek());

        // Pop: remove and return the top element
        System.out.println("Removed top element from intStack (pop): " + intStack.pop());

        // Print intStack after pop operation
        System.out.println("Integer stack after pop: " + intStack);

        // Check if intStack is empty
        System.out.println("Is intStack empty? " + intStack.empty());

        // Print the size of intStack
        System.out.println("Size of intStack: " + intStack.size());

        // Search: get 1-based position of element 23 from top (returns -1 if not found)
        System.out.println("Position of 23 from top: " + intStack.search(23));

        // Iterate through intStack and print each element
        System.out.print("Iterating over intStack: ");
        for (int item : intStack) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Clear all elements from intStack
        intStack.clear();
        System.out.println("Integer stack after clear: " + intStack);
    }
}