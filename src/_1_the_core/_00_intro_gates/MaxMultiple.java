/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

public class MaxMultiple {

    /*
Given a divisor and a bound, find the largest integer
N such that:

N is divisible by divisor.
N is less than or equal to bound.
N is greater than 0.
It is guaranteed that such a number exists.
     */


    int maxMultiple(int divisor, int bound) {
        return bound-bound%divisor;
    }//int maxMultiple(int divisor, int bound) {


    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer divisor

Guaranteed constraints:
2 ≤ divisor ≤ 10.

[input] integer bound

Guaranteed constraints:
5 ≤ bound ≤ 100.

[output] integer

The largest integer not greater than bound that is divisible by divisor.
     */

}//public class MaxMultiple {
