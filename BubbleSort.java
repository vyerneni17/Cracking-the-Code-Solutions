/*
Input format
3       //number of elements in the Array
1 2 3   //elements in the array (space-separated)
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int count=0;
        int tmp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    arr[i] = arr[i]^arr[j];
                    arr[j] = arr[i]^arr[j];
                    arr[i] = arr[i]^arr[j];
                    count++;
                }
            }
        }
        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length-1]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        bubbleSort(a);
    }
}
