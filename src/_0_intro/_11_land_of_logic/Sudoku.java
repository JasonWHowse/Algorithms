/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import java.util.HashSet;

public class Sudoku {

/*
Sudoku is a number-placement puzzle. The
objective is to fill a 9 × 9 grid with
digits so that each column, each row, and
each of the nine 3 × 3 sub-grids that
compose the grid contains all of the
digits from 1 to 9.

This algorithm should check if the given
grid of numbers represents a correct
solution to Sudoku.
 */

    boolean sudoku(int[][] grid) {
        for(int x=0;x<9;x++){
            HashSet<Integer> hS1 = new HashSet<>();
            HashSet<Integer> hS2 = new HashSet<>();
            for(int y=0;y<9;y++){
                hS1.add(grid[x][y]);
                hS2.add(grid[y][x]);
                if((x%3==0)&&(y%3==0)){
                    HashSet<Integer> hS3 = new HashSet<>();
                    for (int x1 = x; x1 < x + 3; x1++) {
                        for (int y1 = y; y1 < y + 3; y1++) {
                            hS3.add(grid[x1][y1]);
                        }//for (int y1 = y; y1 < y + 3; y1++) {
                    }//for (int x1 = x; x1 < x + 3; x1++) {
                    if(hS3.size()!=9){
                        return false;
                    }//if(hS3.size()!=9){
                }//if((x%3==0)&&(y%3==0)){
            }//for(int y=0;y<9;y++){
            if(hS1.size()!=9||hS2.size()!=9){
                return false;
            }//if(hS1.size()!=9||hS2.size()!=9){
        }//for(int x=0;x<9;x++){
        return true;
    }//boolean sudoku(int[][] grid) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.integer grid

A matrix representing 9 × 9 grid already filled with numbers from 1 to 9.

Guaranteed constraints:
grid.length = 9,
grid[i].length = 9,
1 ≤ grid[i][j] ≤ 9.

[output] boolean

true if the given grid represents a correct solution to Sudoku, false otherwise.
 */

}//public class Sudoku {
