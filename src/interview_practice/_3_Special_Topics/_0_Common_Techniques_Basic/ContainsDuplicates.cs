using System.Collections.Generic;

namespace Algorithms.src.interview_practice._3_Special_Topics._0_Common_Techniques_Basic {
    public class ContainsDuplicates {

        /*

Given an array of integers, write a function that determines whether the array contains any duplicates. Your function should return true if any element appears at least twice in the array, and it should return false if every element is distinct.

Example

For a = [1, 2, 3, 1], the output should be
containsDuplicates(a) = true.

There are two 1s in the given array.

For a = [3, 1], the output should be
containsDuplicates(a) = false.

The given array contains no duplicates.

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer a

Guaranteed constraints:
0 ≤ a.length ≤ 105,
-2 · 109 ≤ a[i] ≤ 2 · 109.

[output] boolean

        */

        public
        bool containsDuplicates(int[] a) {
            return a.Length != new HashSet<int>(a).Count;
        }//bool containsDuplicates(int[] a) {
    }//public class ContainsDuplicates {
}//namespace Algorithms.src.interview_practice._3_Special_Topics._0_Common_Techniques_Basic {