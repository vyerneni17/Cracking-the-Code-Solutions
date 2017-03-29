/*
Input format
// The input below is based on options
8        //number of Queries it has to execute
1 14     //First query - 1 defines the type of operation, value to insert
2        //Second query - delete the head element
3        //Display the peek element of the queue
1 42
3
1 17
2
3       //nth query (n=8 in this case)
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        public T peek() {
            newToOld();
            return stackOldestOnTop.peek();
        }

        public T dequeue() {
            newToOld();
            return stackOldestOnTop.pop();
        }

        public void newToOld(){
            if (stackOldestOnTop.isEmpty()){
                while(!stackNewestOnTop.isEmpty())
                    stackOldestOnTop.push(stackNewestOnTop.pop());
            }
        }
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
