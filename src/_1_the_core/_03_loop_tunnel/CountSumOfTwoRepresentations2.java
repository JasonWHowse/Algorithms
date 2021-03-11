/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

public class CountSumOfTwoRepresentations2 {

    /*
Given integers n, l and r, find the number of ways to
represent n as a sum of two integers A and B such that
l ≤ A ≤ B ≤ r.
     */

    int countSumOfTwoRepresentations2(int n, int l, int r) {
        int out=0;
        for(int i=l;i<=r;i++){
            for(int j=i;j<=r&&i+j<=n;j++){
                if(j+i==n){
                    out++;
                }//if(j+i==n){
            }//for(int j=i;j<=r&&i+j<=n;j++){
        }//for(int i=l;i<=r;i++){
        return out;
    }//int countSumOfTwoRepresentations2(int n, int l, int r) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A positive integer.

Guaranteed constraints:
5 ≤ n ≤ 109.

[input] integer l

A positive integer.

Guaranteed constraints:
1 ≤ l ≤ r.

[input] integer r

A positive integer.

Guaranteed constraints:
l ≤ r ≤ 109,
r - l ≤ 106.

[output] integer
     */

}//public class CountSumOfTwoRepresentations2 {
