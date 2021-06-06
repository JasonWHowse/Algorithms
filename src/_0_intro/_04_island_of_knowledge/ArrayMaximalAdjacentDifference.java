/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_island_of_knowledge;

public class ArrayMaximalAdjacentDifference {

    /*
Given an array of integers, find the maximal absolute
difference between any two of its adjacent elements.
     */

    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int out = 0;
        for(int i=1;i< inputArray.length;i++){
            out =Math.max(out,Math.abs(inputArray[i]-inputArray[i-1]));
        }//for(int i=1;i< inputArray.length;i++){
        return out;
    }//int arrayMaximalAdjacentDifference(int[] inputArray) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Guaranteed constraints:
3 ≤ inputArray.length ≤ 10,
-15 ≤ inputArray[i] ≤ 15.

[output] integer

The maximal absolute difference.
     */

}//public class ArrayMaximalAdjacentDifference {
