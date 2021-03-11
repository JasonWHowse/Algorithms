/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

public class IncreaseNumberRoundness {

    /*
Define an integer's roundness as the number of trailing
zeroes in it.

Given an integer n, check if it's possible to increase
n's roundness by swapping some pair of its digits.
     */

    boolean increaseNumberRoundness(int n) {
        return String.valueOf(Integer.parseInt(new StringBuilder(n+"").reverse().toString())).contains("0");
    }//boolean increaseNumberRoundness(int n) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A positive integer.

Guaranteed constraints:
100 ≤ n ≤ 109.

[output] boolean

true if it's possible to increase n's roundness, false otherwise.


     */

}//public class IncreaseNumberRoundness {
