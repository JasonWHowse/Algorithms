namespace Algorithms.src._1_the_core._00_intro_gates {
    public class AddTwoDigits {

        /*

You are given a two-digit integer n. Return the sum of its digits.

Example

For n = 29, the output should be
addTwoDigits(n) = 11.

Input/Output

[execution time limit] 3 seconds (cs)

[input] integer n

A positive two-digit integer.

Guaranteed constraints:
10 ≤ n ≤ 99.

[output] integer

The sum of the first and second digits of the input number.

        */

        public
        int addTwoDigits(int n) {
            return (n / 10) + (n % 10);
        }//int addTwoDigits(int n) {
    }//public class AddTwoDigits {
}//namespace Algorithms.src._1_the_core._00_intro_gates {
