/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._02_smooth_sailing;

import java.util.ArrayList;

public class IsLucky {

/*
Ticket numbers usually consist of an even number of
digits. A ticket number is considered lucky if the
sum of the first half of the digits is equal to the
sum of the second half.

Given a ticket number n, determine if it's lucky or
not.
 */

    boolean isLucky(int n) {
        ArrayList<Integer> stack = new ArrayList<>();
        int c1=0;
        int c2=0;
        while(n>0){
            stack.add(n%10);
            n=n/10;
        }//while(n>0){
        while(stack.size()>0) {
            c1+=stack.get(0);
            c2+=stack.get(stack.size() - 1);
            stack.remove(0);
            stack.remove(stack.size() - 1);
        }//while(stack.size()>0) {
        return c1==c2;
    }//boolean isLucky(int n) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 ≤ n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.
 */

}//public class IsLucky {