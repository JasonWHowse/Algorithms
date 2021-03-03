/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._05_rains_of_reason;

public class EvenDigitsOnly {

/*
Check if all digits of the given integer are even.
 */

    boolean evenDigitsOnly(int n) {
        while (n!=0){
            if((n%10)%2==1){
                return false;
            }//if((n%10)%2==1){
            n/=10;
        }//while (n!=0){
        return true;
    }//boolean evenDigitsOnly(int n) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
1 ≤ n ≤ 109.

[output] boolean

true if all digits of n are even, false otherwise.
 */

}//public class EvenDigitsOnly {