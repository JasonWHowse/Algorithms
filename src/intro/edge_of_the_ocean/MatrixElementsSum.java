/*
 * Authored by: Jason Wesley Howse
 */

package intro.edge_of_the_ocean;

public class MatrixElementsSum {

/*
After becoming famous, the CodeBots decided
to move into a new building together. Each of
the rooms has a different cost, and some of
them are free, but there's a rumour that all
the free rooms are haunted! Since the CodeBots
are quite superstitious, they refuse to stay in
any of the free rooms, or any of the rooms below
any of the free rooms.

Given matrix, a rectangular matrix of integers,
where each value represents the cost of the room,
your task is to return the total sum of all rooms
that are suitable for the CodeBots (ie: add up
all the values that don't appear below a 0)
 */

    int matrixElementsSum(int[][] matrix) {
        int out=0;
        for(int y=0;y<matrix[0].length;y++){
            for (int[] arr : matrix) {
                out += arr[y];
                if (arr[y] == 0) {
                    break;
                }//if(matrix[x][y]==0){
            }//for(int x=0;x<matrix.length;x++){
        }//for(int y=0;y<matrix[0].length;y++){
        return out;
    }//int matrixElementsSum(int[][] matrix) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.integer matrix

A 2-dimensional array of integers representing the cost of each room in the building. A value of 0 indicates that the room is haunted.

Guaranteed constraints:
1 ≤ matrix.length ≤ 5,
1 ≤ matrix[i].length ≤ 5,
0 ≤ matrix[i][j] ≤ 10.
 */

}//public class MatrixElementsSum {