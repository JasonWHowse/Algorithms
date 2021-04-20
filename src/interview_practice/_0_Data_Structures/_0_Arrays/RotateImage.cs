﻿namespace Algorithms.src.interview_practice._0_Data_Structures._0_Arrays {
    public class RotateImage {

        /*

Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked to do during an interview.

You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).

Example

For

a = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
the output should be

rotateImage(a) =
    [[7, 4, 1],
     [8, 5, 2],
     [9, 6, 3]]
Input/Output

[execution time limit] 3 seconds (cs)

[input] array.array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 100,
a[i].length = a.length,
1 ≤ a[i][j] ≤ 104.

[output] array.array.integer

        */

        public
        int[][] rotateImage(int[][] a) {
            int[][] b = new int[a.Length][];
            for(int x = 0; x < a.Length; x++) {
                b[x] = new int[a[x].Length];
                int xLength = a[x].Length;
                for(int y=0; y < xLength; y++) {
                    b[x][y] = a[(xLength - 1)- y][x];
                }//for(int y=0; y < xLength; y++) {
            }//for(int x = 0; x < a.Length; x++) {
            return b;
        }//int[][] rotateImage(int[][] a) {
    }//public class RotateImage {
}//namespace Algorithms.src.interview_practice._0_Data_Structures._0_Arrays {
