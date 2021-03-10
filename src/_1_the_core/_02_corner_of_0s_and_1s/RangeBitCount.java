/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

public class RangeBitCount {

    /*
You are given two numbers a and b where 0 ≤ a ≤ b.
Imagine you construct an array of all the integers
from a to b inclusive. You need to count the number
of 1s in the binary representations of all the
numbers in the array.
     */

    int rangeBitCount(int a, int b) {
        int out=0;
        for(;a<=b;a++){
            int c=a;
            while(c!=0){
                out+=c!=(c>>1)<<1?1:0;
                c=c>>1;
            }//while(c!=0){
        }//for(;a<=b;a++){
        return out;
    }//int rangeBitCount(int a, int b) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer a

Guaranteed constraints:
0 ≤ a ≤ b.

[input] integer b

Guaranteed constraints:
a ≤ b ≤ 10.

[output] integer
     */

}//public class RangeBitCount {
