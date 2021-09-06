using System.Collections.Generic;

namespace Algorithms.src._1_the_core._07_mirror_lake {
    public class DifferentSquares {

        /*

Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.

Example

For

matrix = [[1, 2, 1],
          [2, 2, 2],
          [2, 2, 2],
          [1, 2, 3],
          [2, 2, 1]]
the output should be
differentSquares(matrix) = 6.

Here are all 6 different 2 × 2 squares:

1 2
2 2
2 1
2 2
2 2
2 2
2 2
1 2
2 2
2 3
2 3
2 1
Input/Output

[execution time limit] 3 seconds (cs)

[input] array.array.integer matrix

Guaranteed constraints:
1 ≤ matrix.length ≤ 100,
1 ≤ matrix[i].length ≤ 100,
0 ≤ matrix[i][j] ≤ 9.

[output] integer

The number of different 2 × 2 squares in matrix.

        */

        public
        int differentSquares(int[][] matrix) {
            HashSet<string> hS = new HashSet<string>();
            for (int x = 0; x < matrix.Length - 1; x++) {
                for (int y = 0; y < matrix[x].Length - 1; y++) {
                    hS.Add(matrix[x][y] + "," + matrix[x][y + 1] + "," + matrix[x + 1][y] + "," + matrix[x + 1][y + 1]);
                }//for (int y = 0; y < matrix[x].Length - 1; y++) {
            }//for (int x = 0; x < matrix.Length - 1; x++) {
            return hS.Count;
        }//int differentSquares(int[][] matrix) {
    }//public class DifferentSquares {
}//namespace Algorithms.src._1_the_core._07_mirror_lake {