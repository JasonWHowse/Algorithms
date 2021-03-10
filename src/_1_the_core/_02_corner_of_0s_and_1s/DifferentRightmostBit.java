/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

public class DifferentRightmostBit {

    /*
Implement the missing code, denoted by ellipses. You may
not modify the pre-existing code.

You're given two integers, n and m. Find position of the
rightmost bit in which they differ in their binary
representations (it is guaranteed that such a bit exists),
counting from right to left.

Return the value of 2position_of_the_found_bit (0-based).
     */

    int differentRightmostBit(int n, int m) {
        return (n ^ m)&~(n^m)+1;
    }//int differentRightmostBit(int n, int m) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
0 ≤ n ≤ 230.

[input] integer m

Guaranteed constraints:
0 ≤ m ≤ 230,
n ≠ m.

[output] integer
     */

}//public class DifferentRightmostBit {
