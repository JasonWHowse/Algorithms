/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

public class FirstReverseTry {

    /*
Reversing an array can be a tough task, especially
for a novice programmer. Mary just started coding,
so she would like to start with something basic at
first. Instead of reversing the array entirely, she
wants to swap just its first and last elements.

Given an array arr, swap its first and last elements
and return the resulting array.
     */

    int[] firstReverseTry(int[] arr) {
        if(arr.length!=0) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }//if(arr.length!=0){
        return arr;
    }//int[] firstReverseTry(int[] arr) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer arr

Guaranteed constraints:
0 ≤ arr.length ≤ 50,
-104 ≤ arr[i] ≤ 104.

[output] array.integer

Array arr with its first and its last elements swapped.
     */

}//public class FirstReverseTry {
