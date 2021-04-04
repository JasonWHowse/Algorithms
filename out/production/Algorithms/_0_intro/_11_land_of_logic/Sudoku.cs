using System.Collections.Generic;

namespace Algorithms.src._0_intro._11_land_of_logic {
    public class Sudoku {

        /*

Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with digits so that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid contains all of the digits from 1 to 9.

This algorithm should check if the given grid of numbers represents a correct solution to Sudoku.

Example

For
grid = [[1, 3, 2, 5, 4, 6, 9, 8, 7],
        [4, 6, 5, 8, 7, 9, 3, 2, 1],
        [7, 9, 8, 2, 1, 3, 6, 5, 4],
        [9, 2, 1, 4, 3, 5, 8, 7, 6],
        [3, 5, 4, 7, 6, 8, 2, 1, 9],
        [6, 8, 7, 1, 9, 2, 5, 4, 3],
        [5, 7, 6, 9, 8, 1, 4, 3, 2],
        [2, 4, 3, 6, 5, 7, 1, 9, 8],
        [8, 1, 9, 3, 2, 4, 7, 6, 5]]
the output should be
sudoku(grid) = true;

For
grid = [[1, 3, 2, 5, 4, 6, 9, 2, 7],
        [4, 6, 5, 8, 7, 9, 3, 8, 1],
        [7, 9, 8, 2, 1, 3, 6, 5, 4],
        [9, 2, 1, 4, 3, 5, 8, 7, 6],
        [3, 5, 4, 7, 6, 8, 2, 1, 9],
        [6, 8, 7, 1, 9, 2, 5, 4, 3],
        [5, 7, 6, 9, 8, 1, 4, 3, 2],
        [2, 4, 3, 6, 5, 7, 1, 9, 8],
        [8, 1, 9, 3, 2, 4, 7, 6, 5]]
the output should be
sudoku(grid) = false.

The output should be false: each of the nine 3 × 3 sub-grids should contain all of the digits from 1 to 9.
These examples are represented on the image below.



Input/Output

[execution time limit] 3 seconds (cs)

[input] array.array.integer grid

A matrix representing 9 × 9 grid already filled with numbers from 1 to 9.

Guaranteed constraints:
grid.length = 9,
grid[i].length = 9,
1 ≤ grid[i][j] ≤ 9.

[output] boolean

true if the given grid represents a correct solution to Sudoku, false otherwise.

        */

        public
        bool sudoku(int[][] grid) {
            for (int x = 0; x < 9; x++) {
                HashSet<int> hS1 = new HashSet<int>();
                HashSet<int> hS2 = new HashSet<int>();
                for (int y = 0; y < 9; y++) {
                    hS1.Add(grid[x][y]);
                    hS2.Add(grid[y][x]);
                    if ((x % 3 == 0) && (y % 3 == 0)) {
                        HashSet<int> hS3 = new HashSet<int>();
                        for (int x1 = x; x1 < x + 3; x1++) {
                            for (int y1 = y; y1 < y + 3; y1++) {
                                hS3.Add(grid[x1][y1]);
                            }//for (int y1 = y; y1 < y + 3; y1++) {
                        }//for (int x1 = x; x1 < x + 3; x1++) {
                        if (hS3.Count != 9) {
                            return false;
                        }//if (hS3.Count != 9) {
                    }//if ((x % 3 == 0) && (y % 3 == 0)) {
                }//for (int y = 0; y < 9; y++) {
                if (hS1.Count != 9 || hS2.Count != 9) {
                    return false;
                }//if (hS1.Count != 9 || hS2.Count != 9) {
            }//for (int x = 0; x < 9; x++) {
            return true;
        }//bool sudoku(int[][] grid) {
    }//public class Sudoku {
}//namespace Algorithms.src._0_intro._11_land_of_logic {