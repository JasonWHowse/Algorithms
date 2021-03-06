﻿using System.Collections.Generic;

namespace Algorithms.src.interview_practice._3_Special_Topics._0_Common_Techniques_Basic {
    public class SumOfTwo {

        /*

You have two integer arrays, a and b, and an integer target value v. Determine whether there is a pair of numbers, where one number is taken from a and the other from b, that can be added together to get a sum of v. Return true if such a pair exists, otherwise return false.

Example

For a = [1, 2, 3], b = [10, 20, 30, 40], and v = 42, the output should be
sumOfTwo(a, b, v) = true.

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer a

An array of integers.

Guaranteed constraints:
0 ≤ a.length ≤ 105,
-109 ≤ a[i] ≤ 109.

[input] array.integer b

An array of integers.

Guaranteed constraints:
0 ≤ b.length ≤ 105,
-109 ≤ b[i] ≤ 109.

[input] integer v

Guaranteed constraints:
-109 ≤ v ≤ 109.

[output] boolean

true if there are two elements from a and b which add up to v, and false otherwise.

        */

        public
        bool sumOfTwo(int[] a, int[] b, int v) {
            HashSet<int> d = new HashSet<int>(a);
            foreach(int c in b) { 
                if (d.Contains(v - c)) {
                    return true;
                }//if (d.Contains(v - b[i])) {
            }//foreach(int c in b) { 
            return false;
        }//bool sumOfTwo(int[] a, int[] b, int v) {
    }//public class SumOfTwo {
}//namespace Algorithms.src.interview_practice._3_Special_Topics._0_Common_Techniques_Basic {
