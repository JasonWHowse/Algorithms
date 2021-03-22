/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import java.util.HashSet;

public class DifferentSquares {

/*
Given a rectangular matrix containing only
digits, calculate the number of different
2 × 2 squares in it.
 */

    int differentSquares(int[][] matrix) {
        HashSet<String> hS=new HashSet<>();
        for(int x=0;x<matrix.length-1;x++){
            for(int y=0;y<matrix[x].length-1;y++){
                hS.add(matrix[x][y] + "," + matrix[x][y + 1] + "," + matrix[x + 1][y] + "," + matrix[x + 1][y + 1]);
            }//for(int y=0;y<matrix[x].length-1;y++){
        }//for(int x=0;x<matrix.length-1;x++){
        return hS.size();
    }//int differentSquares(int[][] matrix) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.integer matrix

Guaranteed constraints:
1 ≤ matrix.length ≤ 100,
1 ≤ matrix[i].length ≤ 100,
0 ≤ matrix[i][j] ≤ 9.

[output] integer

The number of different 2 × 2 squares in matrix.
 */

}//public class DifferentSquares {
