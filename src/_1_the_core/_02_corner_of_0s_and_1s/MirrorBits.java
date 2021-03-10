/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

public class MirrorBits {

    /*
Reverse the order of the bits in a given integer.
     */

    int mirrorBits(int a) {
        return Integer.parseInt(new StringBuilder(Integer.toBinaryString(a)).reverse().toString(),2);
    }//int mirrorBits(int a) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer a

Guaranteed constraints:
5 ≤ a ≤ 105.

[output] integer
     */

}//public class MirrorBits {
