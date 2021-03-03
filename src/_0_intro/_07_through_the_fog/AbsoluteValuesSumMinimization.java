/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._07_through_the_fog;

public class AbsoluteValuesSumMinimization {

/*
Given a sorted array of integers a, your task is
to determine which element of a is closest to all
other values of a. In other words, find the
element x in a, which minimizes the following
sum:
 */

    int absoluteValuesSumMinimization(int[] a) {
        return a[(a.length-1)/2];
    }//int absoluteValuesSumMinimization(int[] a) {
/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

A non-empty array of integers, sorted in ascending order.

Guaranteed constraints:
1 ≤ a.length ≤ 1000,
-106 ≤ a[i] ≤ 106.

[output] integer

An integer representing the element from a that minimizes the sum of its absolute differences with all other elements.
 */

}//public class AbsoluteValuesSumMinimization {