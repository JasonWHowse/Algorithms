/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._02_smooth_sailing;

import java.util.ArrayList;
import java.util.Collections;

public class SortByHeight {

/*
Some people are standing in a row in a park.
There are trees between them which cannot be
moved. Your task is to rearrange the people
by their heights in a non-descending order
without moving the trees. People can be very
tall!
 */

    int[] sortByHeight(int[] a) {
        ArrayList<Integer> stack = new ArrayList<>();
        for(int b:a){
            if (b!=-1){
                stack.add(b);
            }//if (b!=-1){
        }//for(int b:a){
        Collections.sort(stack);
        for(int i=0;i<a.length;i++){
            if(a[i]!=-1){
                a[i]=stack.get(0);
                stack.remove(0);
            }//if(a[i]!=-1){
        }//for(int i=0;i<a.length;i++){
        return a;
    }//int[] sortByHeight(int[] a) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in the ith position.

Guaranteed constraints:
1 ≤ a.length ≤ 1000,
-1 ≤ a[i] ≤ 1000.

[output] array.integer

Sorted array a with all the trees untouched.
 */

}
