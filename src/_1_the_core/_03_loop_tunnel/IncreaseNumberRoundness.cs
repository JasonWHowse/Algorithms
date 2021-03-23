using System.Linq;

namespace Algorithms.src._1_the_core._03_loop_tunnel {
    public class IncreaseNumberRoundness {

        /*

Define an integer's roundness as the number of trailing zeroes in it.

Given an integer n, check if it's possible to increase n's roundness by swapping some pair of its digits.

Example

For n = 902200100, the output should be
increaseNumberRoundness(n) = true.

One of the possible ways to increase roundness of n is to swap digit 1 with digit 0 preceding it: roundness of 902201000 is 3, and roundness of n is 2.

For instance, one may swap the leftmost 0 with 1.

For n = 11000, the output should be
increaseNumberRoundness(n) = false.

Roundness of n is 3, and there is no way to increase it.

Input/Output

[execution time limit] 3 seconds (cs)

[input] integer n

A positive integer.

Guaranteed constraints:
100 ≤ n ≤ 109.

[output] boolean

true if it's possible to increase n's roundness, false otherwise.

        */

        public
        bool increaseNumberRoundness(int n) {
            return (""+int.Parse(new string((n + "").ToCharArray().Reverse().ToArray()))).Contains("0");
        }//bool increaseNumberRoundness(int n) {
    }//public class IncreaseNumberRoundness {
}//namespace Algorithms.src._1_the_core._03_loop_tunnel {
