/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

public class SwapAdjacentBits {

    /*
Implement the missing code, denoted by ellipses. You may
not modify the pre-existing code.

You're given an arbitrary 32-bit integer n. Take its binary
representation, split bits into it in pairs (bit number 0
and 1, bit number 2 and 3, etc.) and swap bits in each pair.
Then return the result as a decimal number.
     */

    int swapAdjacentBits(int n) {
        return ((n&1431655765)<<1)|((n&~1431655765)>>1);
    }//int swapAdjacentBits(int n) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
0 ≤ n < 230.

[output] integer
     */

}//public class SwapAdjacentBits {
