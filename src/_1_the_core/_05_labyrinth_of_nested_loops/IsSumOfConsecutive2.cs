namespace Algorithms.src._1_the_core._05_labyrinth_of_nested_loops {
    public class IsSumOfConsecutive2 {

        /*

Find the number of ways to express n as sum of some (at least two) consecutive positive integers.

Example

For n = 9, the output should be
isSumOfConsecutive2(n) = 2.

There are two ways to represent n = 9: 2 + 3 + 4 = 9 and 4 + 5 = 9.

For n = 8, the output should be
isSumOfConsecutive2(n) = 0.

There are no ways to represent n = 8.

Input/Output

[execution time limit] 3 seconds (cs)

[input] integer n

A positive integer.

Guaranteed constraints:
1 ≤ n ≤ 104.

[output] integer

        */

        public
        int isSumOfConsecutive2(int n) {
            int output= n % 2;
            for (int i = 1; i <= n / 2; i += 2) {
                if (n % i == 0) {
                output++;
                }//if (n % i == 0) {
            }//for (int i = 1; i <= n / 2; i += 2) {
            return --output;
        }//int isSumOfConsecutive2(int n) {
    }//public class IsSumOfConsecutive2 {
}//namespace Algorithms.src._1_the_core._05_labyrinth_of_nested_loops {
