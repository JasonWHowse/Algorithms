﻿namespace Algorithms.src._1_the_core._04_list_forest_edge {
    public class IsSmooth {

        /*

We define the middle of the array arr as follows:

if arr contains an odd number of elements, its middle is the element whose index number is the same when counting from the beginning of the array and from its end;
if arr contains an even number of elements, its middle is the sum of the two elements whose index numbers when counting from the beginning and from the end of the array differ by one.
An array is called smooth if its first and its last elements are equal to one another and to the middle. Given an array arr, determine if it is smooth or not.

Example

For arr = [7, 2, 2, 5, 10, 7], the output should be
isSmooth(arr) = true.

The first and the last elements of arr are equal to 7, and its middle also equals 2 + 5 = 7. Thus, the array is smooth and the output is true.

For arr = [-5, -5, 10], the output should be
isSmooth(arr) = false.

The first and middle elements are equal to -5, but the last element equals 10. Thus, arr is not smooth and the output is false.

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer arr

The given array.

Guaranteed constraints:
2 ≤ arr.length ≤ 105,
-109 ≤ arr[i] ≤ 109.

[output] boolean

true if arr is smooth, false otherwise.

        */

        public
        bool isSmooth(int[] arr) {
            return arr[0] == arr[^1] && arr[^1] == ((arr.Length % 2 == 0) ? arr[arr.Length / 2] + arr[(arr.Length / 2) - 1] : arr[(arr.Length - 1) / 2]);
        }//bool isSmooth(int[] arr) {
    }//public class IsSmooth {
}//namespace Algorithms.src._1_the_core._04_list_forest_edge {
