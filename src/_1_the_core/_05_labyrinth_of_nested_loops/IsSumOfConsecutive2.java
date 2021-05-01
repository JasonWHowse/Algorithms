/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

public class IsSumOfConsecutive2 {

    /*
Find the number of ways to express n as sum of
some (at least two) consecutive positive integers.
     */

    int isSumOfConsecutive2(int n) {
        int out=n%2;
        for(int i=1;i<=n/2;i+=2){
            if(n%i==0){
                out++;
            }//if(n%i==0){
        }//for(int i=1;i<=n/2;i+=2){
        return --out;
    }//int isSumOfConsecutive2(int n) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A positive integer.

Guaranteed constraints:
1 ≤ n ≤ 104.

[output] integer
     */

}//public class IsSumOfConsecutive2 {
