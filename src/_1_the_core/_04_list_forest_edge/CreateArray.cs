using System.Linq;

namespace Algorithms.src._1_the_core._04_list_forest_edge {
    public class CreateArray {

        /*

Given an integer size, return array of length size filled with 1s.

Example

For size = 4, the output should be
createArray(size) = [1, 1, 1, 1].

Input/Output

[execution time limit] 3 seconds (cs)

[input] integer size

A positive integer.

Guaranteed constraints:
1 ≤ size ≤ 1000.

[output] array.integer

        */

        public
        int[] createArray(int size) {
            return Enumerable.Repeat(1, size).ToArray();
        }//int[] createArray(int size) {
    }//public class CreateArray {
}//namespace Algorithms.src._1_the_core._04_list_forest_edge {
