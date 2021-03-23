namespace Algorithms.src._1_the_core._02_corner_of_0s_and_1s {
    public class SecondRightmostZeroBit {

        /*

Implement the missing code, denoted by ellipses. You may not modify the pre-existing code.
Presented with the integer n, find the 0-based position of the second rightmost zero bit in its binary representation (it is guaranteed that such a bit exists), counting from right to left.

Return the value of 2position_of_the_found_bit.

Example

For n = 37, the output should be
secondRightmostZeroBit(n) = 8.

3710 = 1001012. The second rightmost zero bit is at position 3 (0-based) from the right in the binary representation of n.
Thus, the answer is 23 = 8.

Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
4 ≤ n ≤ 230.

[output] integer

        */

        public
        int secondRightmostZeroBit(int n) {
            return ~(n | n + 1) & ((n | n + 1) + 1);
        }//int secondRightmostZeroBit(int n) {
    }//public class SecondRightmostZeroBit {
}//namespace Algorithms.src._1_the_core._02_corner_of_0s_and_1s {
