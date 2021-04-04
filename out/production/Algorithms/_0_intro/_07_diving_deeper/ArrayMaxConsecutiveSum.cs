namespace Algorithms.src._0_intro._07_diving_deeper {
    public class ArrayMaxConsecutiveSum {

        /*

Given array of integers, find the maximal possible sum of some of its k consecutive elements.

Example

For inputArray = [2, 3, 5, 1, 6] and k = 2, the output should be
arrayMaxConsecutiveSum(inputArray, k) = 8.
All possible sums of 2 consecutive elements are:

2 + 3 = 5;
3 + 5 = 8;
5 + 1 = 6;
1 + 6 = 7.
Thus, the answer is 8.
Input/Output

[execution time limit] 3 seconds (cs)

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

        public
        int arrayMaxConsecutiveSum(int[] inputArray, int k) {
            int maxVal = 0;
            for (int i = --k; i < inputArray.Length; i++) {
                int currentVal = 0;
                for (int j = i - k; j <= i; j++) {
                    currentVal += inputArray[j];
                }//for (int j = i - k; j <= i; j++) {
                maxVal = System.Math.Max(maxVal, currentVal);
            }//for (int i = --k; i < inputArray.Length; i++) {
            return maxVal;
        }//int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    }//public class ArrayMaxConsecutiveSum {
}//namespace Algorithms.src._0_intro._07_diving_deeper {
