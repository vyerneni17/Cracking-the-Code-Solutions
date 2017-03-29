/*
Input Format
(({[()]}))    // String with brackets as characters
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BracketBalance {

    public static boolean isBalanced(String expression) {
        Stack stk = new Stack();

        for(char c : expression.toCharArray()){
            switch(c){
                case '(' : stk.push(c); break;
                case '[' : stk.push(c); break;
                case '{' : stk.push(c); break;
                case ')' : if(!stk.isEmpty() && stk.peek() == '('){
                                stk.pop();
                                break;
                            }
                            else{
                              break;
                            }
                case '}' : if(!stk.isEmpty() && stk.peek() == '{'){
                                stk.pop();
                                break;
                            }
                            else{
                              break;
                            }
                case ']' : if(!stk.isEmpty() && stk.peek() == '['){
                                stk.pop();
                                break;
                            }
                            else{
                              break;
                            }
                default : break;
            }
        }

        if(stk.isEmpty()){
            return true;
        }
        return false;
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
