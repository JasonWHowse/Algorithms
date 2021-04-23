/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._0_Arrays;

import java.util.HashSet;

public class Sudoku2 {

    /*
Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with numbers in such a way that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid all contain all of the numbers from 1 to 9 one time.

Implement an algorithm that will check whether the given grid of numbers represents a valid Sudoku puzzle according to the layout rules described above. Note that the puzzle represented by grid does not have to be solvable.
     */

    boolean sudoku2(char[][] grid){
        for (int x = 0; x < 9; x++) {
            HashSet<Character> HS = new HashSet<>();
            for (int y = 0; y < 9; y++) {
                if (grid[x][y] != '.' && !HS.add(grid[x][y]) || grid[y][x] != '.' && !HS.add((char)(grid[y][x] + 10)) || grid[x % 3 * 3 + y / 3][x / 3 * 3 + y % 3] != '.' && !HS.add((char)(grid[x % 3 * 3 + y / 3][x / 3 * 3 + y % 3] == '.' ? '.' : grid[x % 3 * 3 + y / 3][x / 3 * 3 + y % 3] + 20))) {//writes 3 lines at a time to the hashset and returns false if there are any duplicates.
                    return false;
                }//if (grid[x][y] != '.' && !HS.add(grid[x][y]) || grid[y][x] != '.' && !HS.add((char)(grid[y][x] + 10)) || grid[x % 3 * 3 + y / 3][x / 3 * 3 + y % 3] != '.' && !HS.add((char)(grid[x % 3 * 3 + y / 3][x / 3 * 3 + y % 3] == '.' ? '.' : grid[x % 3 * 3 + y / 3][x / 3 * 3 + y % 3] + 20))) {/
            }//for (int y = 0; y < 9; y++) {
        }//for (int x = 0; x < 9; x++) {
        return true;
    }//boolean sudoku2(char[][] grid){

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.char grid

A 9 × 9 array of characters, in which each character is either a digit from '1' to '9' or a period '.'.

[output] boolean

Return true if grid represents a valid Sudoku puzzle, otherwise return false.
     */

}//public class Sudoku2 {
