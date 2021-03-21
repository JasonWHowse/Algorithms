namespace Algorithms.src._0_intro._04_island_of_knowledge {
    public class Minesweeper {

        /*

In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a Minesweeper game setup.

Example

For

matrix = [[true, false, false],
          [false, true, false],
          [false, false, false]]
the output should be

minesweeper(matrix) = [[1, 2, 1],
                       [2, 1, 1],
                       [1, 1, 1]]
Check out the image below for better understanding:



Input/Output

[execution time limit] 3 seconds (cs)

[input] array.array.boolean matrix

A non-empty rectangular matrix consisting of boolean values - true if the corresponding cell contains a mine, false otherwise.

Guaranteed constraints:
2 ≤ matrix.length ≤ 100,
2 ≤ matrix[0].length ≤ 100.

[output] array.array.integer

Rectangular matrix of the same size as matrix each cell of which contains an integer equal to the number of mines in the neighboring cells. Two cells are called neighboring if they share at least one corner.



        */

        public
        int[][] minesweeper(bool[][] matrix) {
            int[][] outMat = new int[matrix.Length][];
            for (int x = 0; x < matrix.Length; x++) {
                outMat[x] = new int[matrix[0].Length];
                for (int y = 0; y < matrix[0].Length; y++) {
                    int sum = 0;
                    for (int x1 = x - 1; x1 < x + 2; x1++) {
                        for (int y1 = y - 1; y1 < y + 2; y1++) {
                            if (x1 >= 0 && x1 < matrix.Length && y1 >= 0 && y1 < matrix[0].Length) {
                                if (matrix[x1][y1] && !(x1 == x && y1 == y)) {
                                    sum++;
                                }//if(matrix[x1][y1]&&!(x1==x&&y1==y)){
                            }//if(x1>=0&&x1<matrix.Length&&y1>=0&&y1<matrix[0].Length){
                        }//for(int y1=y-1;y1<y+2;y1++){
                    }//for(int x1=x-1;x1<x+2;x1++){
                    outMat[x][y] = sum;
                }//for(int y=0;y<matrix[0].Length;y++){
            }//for(int x=0;x<matrix.Length;x++){
            return outMat;
        }//int[][] minesweeper(bool[][] matrix) {
    }//public class Minesweeper {
}//namespace Algorithms.src._0_intro._04_island_of_knowledge {
