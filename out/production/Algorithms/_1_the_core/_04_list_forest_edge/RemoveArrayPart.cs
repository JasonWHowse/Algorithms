using System.Linq;

namespace Algorithms.src._1_the_core._04_list_forest_edge {
    public class RemoveArrayPart {

        /*

Remove a part of a given array between given 0-based indexes l and r (inclusive).

Example

For inputArray = [2, 3, 2, 3, 4, 5], l = 2, and r = 4, the output should be
removeArrayPart(inputArray, l, r) = [2, 3, 5].

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer inputArray

Guaranteed constraints:
2 ≤ inputArray.length ≤ 104,
-105 ≤ inputArray[i] ≤ 105.

[input] integer l

Left index of the part to be removed (0-based).

Guaranteed constraints:
0 ≤ l ≤ r.

[input] integer r

Right index of the part to be removed (0-based).

Guaranteed constraints:
l ≤ r < inputArray.length.

[output] array.integer

        */

        public
        int[] removeArrayPart(int[] inputArray, int l, int r) {
            return inputArray[0..l].Concat(inputArray[(r + 1)..]).ToArray();
        }//int[] removeArrayPart(int[] inputArray, int l, int r) {
    }//public class RemoveArrayPart {
}//namespace Algorithms.src._1_the_core._04_list_forest_edge {
