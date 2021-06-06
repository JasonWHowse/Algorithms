namespace Algorithms.src.interview_practice._3_Special_Topics._0_Common_Techniques_Basic {
    public class ArrayMaxConsecutiveSum2 {

        /*
Given an array of integers, find the maximum possible sum you can get from one of its contiguous subarrays. The subarray from which this sum comes must contain at least 1 element.

Example

For inputArray = [-2, 2, 5, -11, 6], the output should be
arrayMaxConsecutiveSum2(inputArray) = 7.

The contiguous subarray that gives the maximum possible sum is [2, 5], with a sum of 7.

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer inputArray

An array of integers.

Guaranteed constraints:
3 ≤ inputArray.length ≤ 105,
-1000 ≤ inputArray[i] ≤ 1000.

[output] integer

The maximum possible sum of a subarray within inputArray.
        */

        public
        int arrayMaxConsecutiveSum2(int[] inputArray) {
            int s = 0;
            int m = inputArray[0];
            foreach (int i in inputArray) {
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
    }//public class ArrayMaxConsecutiveSum2 {
}//namespace Algorithms.src.interview_practice._3_Special_Topics._0_Common_Techniques_Basic {
