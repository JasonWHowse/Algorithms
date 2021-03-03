/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_island_of_knowledge;

public class Minesweeper {

    /*
In the popular Minesweeper game you have a
board with some mines and those cells that
don't contain a mine have a number in it that
indicates the total number of mines in the
neighboring cells. Starting off with some
arrangement of mines we want to create a
Minesweeper game setup.
     */

    int[][] minesweeper(boolean[][] matrix) {
        int[][] output=new int[matrix.length][matrix[0].length];
        for(int x1=0;x1<output.length;x1++){
            for(int y1=0;y1<output[x1].length;y1++){
                int sum=0;
                for(int x2=Math.max(0,x1-1);x2<Math.min(matrix.length,x1+2);x2++){
                    for(int y2=Math.max(0,y1-1);y2<Math.min(matrix[x2].length,y1+2);y2++){
                        if(matrix[x2][y2]&&!(x2==x1&&y1==y2)) {
                            sum++;
                        }//if(matrix[x2][y2]&&!(x2==x1&&y1==y2)) {
                    }//for(int y2=Math.max(0,y1-1);y2<Math.min(matrix[x2].length,y1+2);y2++){
                }//for(int x2=Math.max(0,x1-1);x2<Math.min(matrix.length,x1+2);x2++){
                output[x1][y1]=sum;
            }//for(int y1=0;y1<output[x1].length;y1++){
        }//for(int x1=0;x1<output.length;x1++){
        return output;
    }//int[][] minesweeper(boolean[][] matrix) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.boolean matrix

A non-empty rectangular matrix consisting of boolean values - true if the corresponding cell contains a mine, false otherwise.

Guaranteed constraints:
2 ≤ matrix.length ≤ 100,
2 ≤ matrix[0].length ≤ 100.

[output] array.array.integer

Rectangular matrix of the same size as matrix each cell of which contains an integer equal to the number of mines in the neighboring cells. Two cells are called neighboring if they share at least one corner.
     */

}//public class minesweeper {
