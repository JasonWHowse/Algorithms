/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._07_mirror_lake;

import java.util.Hashtable;
public class MostFrequentDigitSum {

    /*
A step(x) operation works like this: it changes a number x into x - s(x), where s(x) is the sum of x's digits. You like applying functions to numbers, so given the number n, you decide to build a decreasing sequence of numbers: n, step(n), step(step(n)), etc., with 0 as the last element.

Building a single sequence isn't enough for you, so you replace all elements of the sequence with the sums of their digits (s(x)). Now you're curious as to which number appears in the new sequence most often. If there are several answers, return the maximal one.
     */

    int mostFrequentDigitSum(int n) {
        return 10 > n ? n : 1000 > n ? 9 : 18;
    }//int mostFrequentDigitSum(int n) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
1 ≤ n ≤ 105.

[output] integer

The most frequent number in the sequence s(n), s(step(n)), s(step(step(n))), etc.
     */

}//public class MostFrequentDigitSum {
