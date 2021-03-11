/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

public class LeastFactorial {

    /*
Given an integer n, find the minimal k such that

    k = m! (where m! = 1 * 2 * ... * m) for some integer m;

    k >= n.

In other words, find the smallest factorial which is not
less than n.
     */

    int leastFactorial(int n) {
        int fac=1;
        int i=1;
        while(true){
            fac*=i++;
            if(fac>=n||fac<0){
                return fac;
            }//if(fac>=n){
        }//while(true){
    }//int leastFactorial(int n) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A positive integer.

Guaranteed constraints:
1 ≤ n ≤ 120.

[output] integer
     */

}//public class LeastFactorial {
