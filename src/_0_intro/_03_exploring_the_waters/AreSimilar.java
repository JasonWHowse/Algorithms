/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._03_exploring_the_waters;

public class AreSimilar {

/*
Two arrays are called similar if one can be obtained
from another by swapping at most one pair of
elements in one of the arrays.

Given two arrays a and b, check whether they are
similar.


 */
    boolean areSimilar(int[] a, int[] b) {
        int c=-1,d=-1;
        for(int i=0;i<a.length&&i<b.length;i++){
            if(a[i]!=b[i]){
                if(c==-1){
                    c=i;
                } else if(d==-1){//if(c==-1){
                    d=i;
                }else return false;//else if(d==-1){
            }//if(a[i]!=b[i]){
        }//for(int i=0;i<a.length&&i<b.length;i++){
        return d==-1||(b[c]==a[d]&&b[d]==a[c]);
    }//boolean areSimilar(int[] a, int[] b) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Array of integers.

Guaranteed constraints:
3 ≤ a.length ≤ 105,
1 ≤ a[i] ≤ 1000.

[input] array.integer b

Array of integers of the same length as a.

Guaranteed constraints:
b.length = a.length,
1 ≤ b[i] ≤ 1000.

[output] boolean

true if a and b are similar, false otherwise.
 */

}//public class AreSimilar {