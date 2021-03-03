/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._06_diving_deeper;

public class ArrayMaxConsecutiveSum {

/*
Given array of integers, find the maximal possible
sum of some of its k consecutive elements.
 */

    int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int max=0;
        for(int i=--k;i<inputArray.length;i++){
            int cVal=0;
            for(int j=i-k;j<=i;j++){
                cVal+=inputArray[j];
            }//for(int j=i-k;j<=i;j++){
            max=Math.max(cVal, max);
        }//for(int i=--k;i<inputArray.length;i++){
        return max;
    }//int arrayMaxConsecutiveSum(int[] inputArray, int k) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Array of positive integers.

Guaranteed constraints:
3 ≤ inputArray.length ≤ 105,
1 ≤ inputArray[i] ≤ 1000.

[input] integer k

An integer (not greater than the length of inputArray).

Guaranteed constraints:
1 ≤ k ≤ inputArray.length.

[output] integer

The maximal possible sum.
 */

}//public class ArrayMaxConsecutiveSum {
