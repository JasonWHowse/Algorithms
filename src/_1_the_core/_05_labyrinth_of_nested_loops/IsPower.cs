namespace Algorithms.src._1_the_core._05_labyrinth_of_nested_loops {
    public class IsPower {

        /*

Determine if the given number is a power of some non-negative integer.

Example

For n = 125, the output should be
isPower(n) = true;
For n = 72, the output should be
isPower(n) = false.
Input/Output

[execution time limit] 3 seconds (cs)

[input] integer n

A positive integer.

Guaranteed constraints:
1 ≤ n ≤ 400.

[output] boolean

true if n can be represented in the form ab (a to the power of b) where a and b are some non-negative integers and b ≥ 2, false otherwise.

        */

        public
        bool isPower(int n) {
            for (int i = 1; i < 21; i++) {
                for (int i2 = 2; i2 < 10; i2++) {
                    if (System.Math.Pow(i, i2) == n) {
                        return true;
                    }//if (System.Math.Pow(i, i2) == n) {
                }//for (int i2 = 2; i2 < 10; i2++) {
            }//for (int i = 1; i < 21; i++) {
            return false;
        }//bool isPower(int n) {
    }//public class IsPower {
}//namespace Algorithms.src._1_the_core._05_labyrinth_of_nested_loops {
