namespace Algorithms.src._1_the_core._04_list_forest_edge {
    public class FirstReverseTry {

        /*

Reversing an array can be a tough task, especially for a novice programmer. Mary just started coding, so she would like to start with something basic at first. Instead of reversing the array entirely, she wants to swap just its first and last elements.

Given an array arr, swap its first and last elements and return the resulting array.

Example

For arr = [1, 2, 3, 4, 5], the output should be
firstReverseTry(arr) = [5, 2, 3, 4, 1].

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer arr

Guaranteed constraints:
0 ≤ arr.length ≤ 50,
-104 ≤ arr[i] ≤ 104.

[output] array.integer

Array arr with its first and its last elements swapped.

        */

        public
        int[] firstReverseTry(int[] arr) {
            if (arr.Length != 0) {
                int temp = arr[0];
                arr[0] = arr[^1];
                arr[^1] = temp;
            }//if(arr.length!=0){
            return arr;
        }//int[] firstReverseTry(int[] arr) {
    }//public class FirstReverseTry {
}//namespace Algorithms.src._1_the_core._04_list_forest_edge {
