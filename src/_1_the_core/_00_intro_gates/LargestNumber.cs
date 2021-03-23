namespace Algorithms.src._1_the_core._00_intro_gates {
    public class LargestNumber {

        /*

Given an integer n, return the largest number that contains exactly n digits.

Example

For n = 2, the output should be
largestNumber(n) = 99.

Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
1 ≤ n ≤ 9.

[output] integer

The largest integer of length n.

        */

        public
        int largestNumber(int n) {
            return (int)System.Math.Pow(10, n) - 1;
        }//int largestNumber(int n) {
    }//public class LargestNumber {
}//namespace Algorithms.src._1_the_core._00_intro_gates {
