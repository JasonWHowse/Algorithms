/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

public class IsInfiniteProcess {

    /*
Given integers a and b, determine whether the following
pseudocode results in an infinite loop

while a is not equal to b do
  increase a by 1
  decrease b by 1

Assume that the program is executed on a virtual
machine which can store arbitrary long numbers and
execute forever.
     */

    boolean isInfiniteProcess(int a, int b) {
        return a>b||a%2!=b%2;
    }//boolean isInfiniteProcess(int a, int b) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer a

Guaranteed constraints:
0 ≤ a ≤ 20.

[input] integer b

Guaranteed constraints:
0 ≤ b ≤ 20.

[output] boolean

true if the pseudocode will never stop, false otherwise.
     */

}//public class IsInfiniteProcess {
