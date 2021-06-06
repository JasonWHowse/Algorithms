/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._3_Special_Topics._0_Common_Techniques_Basic;

import java.util.HashSet;

public class SumOfTwo {

    /*
You have two integer arrays, a and b, and an integer target value v. Determine whether there is a pair of numbers, where one number is taken from a and the other from b, that can be added together to get a sum of v. Return true if such a pair exists, otherwise return false.
     */

    boolean sumOfTwo(int[] a, int[] b, int v) {
        HashSet<Integer> d = new HashSet<>();
        for(int e:a){
            d.add(e);
        }//for(int e:a){
        for(int c : b){
            if(d.contains(v-c)){
                return true;
            }//if(d.contains(v-c)){
        }//for(int c : b){
        return false;
    }//boolean sumOfTwo(int[] a, int[] b, int v) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

An array of integers.

Guaranteed constraints:
0 ≤ a.length ≤ 105,
-109 ≤ a[i] ≤ 109.

[input] array.integer b

An array of integers.

Guaranteed constraints:
0 ≤ b.length ≤ 105,
-109 ≤ b[i] ≤ 109.

[input] integer v

Guaranteed constraints:
-109 ≤ v ≤ 109.

[output] boolean

true if there are two elements from a and b which add up to v, and false otherwise.
     */

}//public class SumOfTwo {
