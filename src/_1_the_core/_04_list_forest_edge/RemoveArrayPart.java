/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

public class RemoveArrayPart {

    /*
Remove a part of a given array between given 0-based
indexes l and r (inclusive).
     */

    int[] removeArrayPart(int[] inputArray, int l, int r) {
        int[] c= java.util.Arrays.copyOf(inputArray,inputArray.length-(r-l)-1);
        System.arraycopy(inputArray, r+1, c, l, inputArray.length-r-1);
        return c;
    }//int[] removeArrayPart(int[] inputArray, int l, int r) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Guaranteed constraints:
2 ≤ inputArray.length ≤ 104,
-105 ≤ inputArray[i] ≤ 105.

[input] integer l

Left index of the part to be removed (0-based).

Guaranteed constraints:
0 ≤ l ≤ r.

[input] integer r

Right index of the part to be removed (0-based).

Guaranteed constraints:
l ≤ r < inputArray.length.

[output] array.integer
     */

}//public class RemoveArrayPart {
