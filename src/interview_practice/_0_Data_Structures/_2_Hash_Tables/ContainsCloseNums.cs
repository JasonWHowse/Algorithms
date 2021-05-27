using System.Collections.Generic;

namespace Algorithms.src.interview_practice._0_Data_Structures._2_Hash_Tables {
    public class ContainsCloseNums {

        /*

Given an array of integers nums and an integer k, determine whether there are two distinct indices i and j in the array where nums[i] = nums[j] and the absolute difference between i and j is less than or equal to k.

Example

For nums = [0, 1, 2, 3, 5, 2] and k = 3, the output should be
containsCloseNums(nums, k) = true.

There are two 2s in nums, and the absolute difference between their positions is exactly 3.

For nums = [0, 1, 2, 3, 5, 2] and k = 2, the output should be
containsCloseNums(nums, k) = false.

The absolute difference between the positions of the two 2s is 3, which is more than k.

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer nums

Guaranteed constraints:
0 ≤ nums.length ≤ 55000,
-231 - 1 ≤ nums[i] ≤ 231 - 1.

[input] integer k

Guaranteed constraints:
0 ≤ k ≤ 35000.

[output] boolean

        */

        public
        bool containsCloseNums(int[] nums, int k) {
            var dict = new Dictionary<int, int>();
            for(int i = 0; i < nums.Length; i++) {
                if (!dict.TryAdd(nums[i], i)) {
                    if (i - dict[nums[i]] <= k) {
                        return true;
                    }//if (i - dict[nums[i]] <= k) {
                    dict[nums[i]] = i;
                }//if (!dict.TryAdd(nums[i], i)) {
            }//for(int i = 0; i < nums.Length; i++) {
            return false;
        }//bool containsCloseNums(int[] nums, int k) {
    }//public class ContainsCloseNums {
}//namespace Algorithms.src.interview_practice._0_Data_Structures._2_Hash_Tables {
