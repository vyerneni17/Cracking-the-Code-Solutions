/*
This is an optimized code for the previous version of the same problem
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BracketBalanceOptimized   {

    public static boolean isBalanced(String expression) {

        if ((expression.length() & 1) == 1) return false;

        else{
            Stack<Character> stk = new Stack();

        for(char c : expression.toCharArray()){
            switch(c){
                case '(' : stk.push(')'); break;
                case '[' : stk.push(']'); break;
                case '{' : stk.push('}'); break;
                default :
                if(stk.isEmpty() || c!=stk.peek())
                   return false;
                stk.pop();
            }
        }
        return stk.isEmpty();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
