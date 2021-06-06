/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._3_Special_Topics._0_Common_Techniques_Basic;

public class ArrayMaxConsecutiveSum2 {

    /*
Given an array of integers, find the maximum possible sum you can get from one of its contiguous subarrays. The subarray from which this sum comes must contain at least 1 element.
     */

    int arrayMaxConsecutiveSum2(int[] inputArray) {
        int s = 0;
        int m = inputArray[0];
        for (int i : inputArray) {
            s += i;
            if (m < s) {
                m = s;
            }//if(m<s){
            if (s < 0) {
                s = 0;
            }//if(s<0){
        }//foreach(int i in inputArray){
        return m;
    }//int arrayMaxConsecutiveSum2(int[] inputArray) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

An array of integers.

Guaranteed constraints:
3 ≤ inputArray.length ≤ 105,
-1000 ≤ inputArray[i] ≤ 1000.

[output] integer

The maximum possible sum of a subarray within inputArray.
     */

}//public class ArrayMaxConsecutiveSum2 {
