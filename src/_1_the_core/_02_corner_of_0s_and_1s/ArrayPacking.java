/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

public class ArrayPacking {

    /*
You are given an array of up to four non-negative integers,
each less than 256.

Your task is to pack these integers into one number M in
the following way:

    The first element of the array occupies the first 8 bits
    of M;

    The second element occupies next 8 bits, and so on.

Return the obtained integer M.

Note: the phrase "first bits of M" refers to the least
significant bits of M - the right-most bits of an integer. For
further clarification see the following example.

     */

    int arrayPacking(int[] a) {
        for(int i=a.length-2;i>=0;i--) {
            a[a.length-1]=(a[a.length-1]<<8)+a[i];
        }//for(int i=a.length-2;i>=0;i--) {
        return a[a.length-1];
    }//int arrayPacking(int[] a) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 4,
0 ≤ a[i] < 256.

[output] integer
     */

}//public class ArrayPacking {
