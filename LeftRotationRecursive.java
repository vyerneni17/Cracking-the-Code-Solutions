/*
Input format
5 4         // number of elements, number of times to rotate
1 2 3 4 5   // elements in the array
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotationRecursive {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int size = a.length;
        int tmp = a[0];
        if(k > 0){
            for(int i=1;i<size;i++){
                a[i-1] = a[i];
            }
            a[size-1] = tmp;
            arrayLeftRotation(a,n,k-1);
        }
        else{
            return a;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
