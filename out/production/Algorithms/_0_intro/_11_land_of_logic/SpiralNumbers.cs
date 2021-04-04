namespace Algorithms.src._0_intro._11_land_of_logic {
    public class SpiralNumbers {

        /*

Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.

Example

For n = 3, the output should be

spiralNumbers(n) = [[1, 2, 3],
                    [8, 9, 4],
                    [7, 6, 5]]
Input/Output

[execution time limit] 3 seconds (cs)

[input] integer n

Matrix size, a positive integer.

Guaranteed constraints:
3 ≤ n ≤ 100.

[output] array.array.integer

        */

        public
        int[][] spiralNumbers(int n) {
            int[][] spiral = new int[n][];
            for(int i = 0; i < n; i++) { 
                 spiral[i] = new int[n];
            }//for(int i = 0; i < n; i++) {
            int index = 0;
            int topBound = -1;
            int leftBound = -1;
            int bottomBound = n;
            int rightBound = n;
            int x = 0;
            int y = 0;
            for (int i = 1; i < n * n + 1; i++) {
                if (index == 0) {
                    spiral[x][y++] = i;
                    if (y == rightBound) {
                        index++;
                        y--;
                        topBound++;
                        x++;
                    }//if(y==rightBound){
                } else if (index == 1) {//if(index==0){
                    spiral[x++][y] = i;
                    if (x == bottomBound) {
                        index++;
                        x--;
                        rightBound--;
                        y--;
                    }//if(x==bottomBound){
                } else if (index == 2) {//else if(index==1){
                    spiral[x][y--] = i;
                    if (y == leftBound) {
                        index++;
                        y++;
                        bottomBound--;
                        x--;
                    }//if(y==leftBound){
                } else if (index == 3) {//else if(index==2){
                    spiral[x--][y] = i;
                    if (x == topBound) {
                        index = 0;
                        x++;
                        leftBound++;
                        y++;
                    }//if(x==topBound){
                }//else if(index==3){
            }//for(int i=1;i<n*n+1;i++){
            return spiral;
        }//int[][] spiralNumbers(int n){
    }//public class SpiralNumbers {
}//namespace Algorithms.src._0_intro._11_land_of_logic {
