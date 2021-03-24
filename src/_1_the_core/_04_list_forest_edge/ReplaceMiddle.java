/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

import java.util.Arrays;

public class ReplaceMiddle {

    /*
We define the middle of the array arr as follows:

    if arr contains an odd number of elements, its
    middle is the element whose index number is the
    same when counting from the beginning of the
    array and from its end;

    if arr contains an even number of elements, its
    middle is the sum of the two elements whose
    index numbers when counting from the beginning
    and from the end of the array differ by one.

Given array arr, your task is to find its middle,
and, if it consists of two elements, replace those
elements with the value of middle. Return the
resulting array as the answer.
     */

    int[] replaceMiddle(int[] arr) {
        if(arr.length%2==1){
            return arr;
        }//if(arr.length%2==1){
        int[] c= Arrays.copyOf(arr,arr.length-1);
        c[(arr.length/2)-1]=arr[arr.length/2]+arr[(arr.length/2)-1];
        System.arraycopy(arr,(arr.length/2)+1,c,arr.length/2,(arr.length/2)-1);
        return c;
    }//int[] replaceMiddle(int[] arr) {

    /*
Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer arr

The given array.

Guaranteed constraints:
2 ≤ arr.length ≤ 104,
-103 ≤ arr[i] ≤ 103.

[output] array.integer

arr with its middle replaced by a single element, or the initial array if the middle consisted of a single element to begin with.


     */

}//public class ReplaceMiddle {
