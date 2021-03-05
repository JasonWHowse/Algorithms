/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._10_rainbow_of_clarity;

public class DeleteDigit {

/*
Given some integer, find the maximal number
you can obtain by deleting exactly one
digit of the given number.
 */

    int deleteDigit(int n) {
        int max=0;
        for(int i=1;i<n;i*=10){
            max=Math.max(max,(n%(i))+((n/(i*10))*i));
        }
        return max;
    }//int deleteDigit(int n) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
10 ≤ n ≤ 106.

[output] integer
 */

}//public class DeleteDigit {
