namespace Algorithms.src._0_intro._01_edge_of_the_ocean {
    public class AdjacentElementsProduct {

        /*

Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.

7 and 3 produce the largest product.

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer inputArray

An array of integers containing at least two elements.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
-1000 ≤ inputArray[i] ≤ 1000.

[output] integer

The largest product of adjacent elements.

        */
        public
        int adjacentElementsProduct(int[] inputArray) {
            int max = inputArray[0] * inputArray[1];
            for (int i = 2; i < inputArray.Length; i++) {
                max = System.Math.Max(max, inputArray[i - 1] * inputArray[i]);
            }//for(int i = 2; i < inputArray.Length; i++) {
            return max;
        }//int adjacentElementsProduct(int[] inputArray) {
    }//public class AdjacentElementsProduct {
}//namespace Algorithms.src._0_intro._01_edge_of_the_ocean {