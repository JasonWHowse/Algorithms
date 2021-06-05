/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._3_Special_Topics._0_Common_Techniques_Basic;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicates{

        /*
Given an array of integers, write a function that determines whether the array contains any duplicates. Your function should return true if any element appears at least twice in the array, and it should return false if every element is distinct.
         */

    boolean containsDuplicates(int[] a) {
        HashSet<Integer> b = new HashSet<>();
        for(int u : a){
            b.add(u);
        }//for(int u : a){
        return a.length!=b.size();
    }//boolean containsDuplicates(int[] a) {

        /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Guaranteed constraints:
0 ≤ a.length ≤ 105,
-2 · 109 ≤ a[i] ≤ 2 · 109.

[output] boolean
         */

}//public class ContainsDuplicates {
