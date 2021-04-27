/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

public class IsPower {

    /*
Determine if the given number is a power of
some non-negative integer.
     */

    boolean isPower(int n) {
        for(int i=1;i<=n/2+1;i++){
            double p=0;
            for(int j=2;j<=8&&p<=n;j++){
                p=Math.pow(i,j);
                if(p==n){
                    return true;
                }//if(p==n){
            }//for(int j=2;j<=8&&p<=n;j++){
        }//for(int i=1;i<=n/2;i++){
        return false;
    }//boolean isPower(int n) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A positive integer.

Guaranteed constraints:
1 ≤ n ≤ 400.

[output] boolean

true if n can be represented in the form ab (a to the power of b) where a and b are some non-negative integers and b ≥ 2, false otherwise.
     */

}//public class IsPower {
