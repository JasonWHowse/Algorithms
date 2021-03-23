﻿namespace Algorithms.src._1_the_core._02_corner_of_0s_and_1s {
    public class EqualPairOfBits {

        /*

Implement the missing code, denoted by ellipses. You may not modify the pre-existing code.
You're given two integers, n and m. Find position of the rightmost pair of equal bits in their binary representations (it is guaranteed that such a pair exists), counting from right to left.

Return the value of 2position_of_the_found_pair (0-based).

Example

For n = 10 and m = 11, the output should be
equalPairOfBits(n, m) = 2.

1010 = 10102, 1110 = 10112, the position of the rightmost pair of equal bits is the bit at position 1 (0-based) from the right in the binary representations.
So the answer is 21 = 2.

Input/Output

[execution time limit] 3 seconds (cs)

[input] integer n

Guaranteed constraints:
0 ≤ n ≤ 230.

[input] integer m

Guaranteed constraints:
0 ≤ m ≤ 230.

[output] integer
        
        */

        public
        int equalPairOfBits(int n, int m) {
            return (n ^ m) + 1 & ~(n ^ m);
        }//int equalPairOfBits(int n, int m) {
    }//public class EqualPairOfBits {
}//namespace Algorithms.src._1_the_core._02_corner_of_0s_and_1s {
