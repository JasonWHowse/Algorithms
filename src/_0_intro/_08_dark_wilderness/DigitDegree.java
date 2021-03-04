/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._08_dark_wilderness;

public class DigitDegree {

/*
Let's define digit degree of some positive
integer as the number of times we need to
replace this number with the sum of its
digits until we get to a one digit number.

Given an integer, find its digit degree.
 */

    int digitDegree(int n) {
        int count=0;
        while(n>=10){
            int currentSum=0;
            while(n!=0){
                currentSum+=n%10;
                n/=10;
            }//while(n!=0){
            n=currentSum;
            count++;
        }//while(n>=10){
        return count;
    }//int digitDegree(int n) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
5 ≤ n ≤ 109.

[output] integer
 */

}//public class DigitDegree {
