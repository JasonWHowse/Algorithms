/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

public class PhoneCall {

    /*
Some phone usage rate may be described as follows:

    first minute of a call costs min1 cents,

    each minute from the 2nd up to 10th (inclusive) costs
    min2_10 cents

    each minute after 10th costs min11 cents.

You have s cents on your account before the call. What is
the duration of the longest call (in minutes rounded down
to the nearest integer) you can have?
     */

    int phoneCall(int min1, int min2_10, int min11, int s) {
        return (s<min1)?0:(s<min1+min2_10)?1:(s<=min1+9*min2_10)?((s-min1)/min2_10)+1:(s-min1-9*min2_10)/min11+10;
    }//int phoneCall(int min1, int min2_10, int min11, int s) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer min1

Guaranteed constraints:
1 ≤ min1 ≤ 10.

[input] integer min2_10

Guaranteed constraints:
1 ≤ min2_10 ≤ 10.

[input] integer min11

Guaranteed constraints:
1 ≤ min11 ≤ 10.

[input] integer s

Guaranteed constraints:
2 ≤ s ≤ 500.

[output] integer
     */

}//public class PhoneCall {
