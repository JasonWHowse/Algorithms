/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Copy;

public class KillKthBit {

    /*
Implement the missing code, denoted by ellipses. You
may not modify the pre-existing code.

In order to stop the Mad Coder evil genius you need
to decipher the encrypted message he sent to his
minions. The message contains several numbers that,
when typed into a supercomputer, will launch a missile
into the sky blocking out the sun, and making all the
people on Earth grumpy and sad.

You figured out that some numbers have a modified single
digit in their binary representation. More specifically,
in the given number n the kth bit from the right was
initially set to 0, but its current value might be
different. It's now up to you to write a function that
will change the kth bit of n back to 0.
     */

    int killKthBit(int n, int k) {
//        return n&(Integer.MAX_VALUE^((int)Math.pow(2,k-1)));
        return n&~(int)Math.pow(2,k-1);
    }//int killKthBit(int n, int k) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
0 ≤ n ≤ 231 - 1.

[input] integer k

The 1-based index of the changed bit (counting from the right).

Guaranteed constraints:
1 ≤ k ≤ 31.

[output] integer
     */

}//public class KillKthBit {
