/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

import java.util.Arrays;

public class ConcatenateArrays {

    /*
Given two arrays of integers a and b, obtain the
array formed by the elements of a followed by the
elements of b.
     */

    int[] concatenateArrays(int[] a, int[] b) {
        int[] c=Arrays.copyOf(a,a.length+b.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }//int[] concatenateArrays(int[] a, int[] b) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 10,
1 ≤ a[i] ≤ 15.

[input] array.integer b

Guaranteed constraints:
0 ≤ b.length ≤ 10,
1 ≤ b[i] ≤ 15.

[output] array.integer
     */

}//public class ConcatenateArrays {
