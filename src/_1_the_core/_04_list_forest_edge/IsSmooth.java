/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

public class IsSmooth {

    /*
We define the middle of the array arr as follows:

    if arr contains an odd number of elements, its middle
    is the element whose index number is the same when
    counting from the beginning of the array and from its
    end;

    if arr contains an even number of elements, its middle
    is the sum of the two elements whose index numbers
    when counting from the beginning and from the end of
    the array differ by one.

An array is called smooth if its first and its last
elements are equal to one another and to the middle. Given
an array arr, determine if it is smooth or not.
     */

    boolean isSmooth(int[] arr) {
        return arr[0]==arr[arr.length-1]&&arr[arr.length-1]==((arr.length%2==0)?arr[arr.length/2]+arr[(arr.length/2)-1]:arr[(arr.length-1)/2]);
    }//boolean isSmooth(int[] arr) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer arr

The given array.

Guaranteed constraints:
2 ≤ arr.length ≤ 105,
-109 ≤ arr[i] ≤ 109.

[output] boolean

true if arr is smooth, false otherwise.
     */

}//public class IsSmooth {
