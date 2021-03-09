/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

public class LateRide {

    /*
Given an integer n, return the largest
number that contains exactly n digits.
     */

    int lateRide(int n) {
        return (n/600)+(n/60)%10+(n%60)/10+(n%60)%10;
    }//int lateRide(int n) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
1 ≤ n ≤ 9.

[output] integer

The largest integer of length n.
     */

}//public class LateRide {
