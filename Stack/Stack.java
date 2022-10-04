// stack.java
// demonstrates stacks
// to run this program: C>java StackApp
////////////////////////////////////////////////////////////////
package Stack;

import java.util.Arrays;

public class Stack {
    private int maxSize; // size of stack array
    private int[] stackArray;
    private int top; // top of stack
    // --------------------------------------------------------------

    public Stack(int s) // constructor
    {
        maxSize = s; // set array size
        stackArray = new int[maxSize]; // create array
        top = -1; // no items yet
    }

    // --------------------------------------------------------------
    public void push(int j) // put item on top of stack
    {
        stackArray[++top] = j; // increment top, insert item
    }

    // --------------------------------------------------------------
    public int pop() // take item from top of stack
    {
        return stackArray[top--]; // access item, decrement top
    }

    // --------------------------------------------------------------
    public int peek() // peek at top of stack
    {
        return stackArray[top];
    }

    // --------------------------------------------------------------
    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }

    // --------------------------------------------------------------
    public boolean isFull() // true if stack is full
    {
        return (top == maxSize - 1);
    }

    // --------------------------------------------------------------
    public void print() // print the stack
    {
        String s = "";
        for( int i = 0; i <= top; i++)
        {
            s =  s + stackArray[i] + ",";
        }
        System.out.println(s);
    }

    // --------------------------------------------------------------
    public void removeSecond() // remove second item
    {
        int removalIndex = 1;
        // Remove second item
        if(top < 1){
            System.out.println("Array length less than 2.");
            return;
        }
 
        // Create another array of size one less
        int[] anotherArray = new int[stackArray.length - 1];
 
        for( int i = 0; i < top; i++)
        {
            int index_tobe_used = i >= 1 ? i + 1 : i;

            anotherArray[i] = stackArray[index_tobe_used];
        }

        stackArray = anotherArray;
        top = top - 1;
    }
} // end class StackX
  ////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////
