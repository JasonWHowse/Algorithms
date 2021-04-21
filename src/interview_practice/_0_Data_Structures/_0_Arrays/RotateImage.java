/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._0_Arrays;

public class RotateImage {

    /*
Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked to do during an interview.

You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).
     */

    int[][] rotateImage(int[][] a) {
        int[][] b = new int[a.length][];
        for(int x=0;x<a.length;x++){
            int xLength=a[x].length;
            b[x]=new int[xLength];
            for(int y=0;y<xLength;y++){
                b[x][y]=a[(xLength-1)-y][x];
            }//for(int y=0;y<xLength;y++){
        }//for(int x=0;x<a.length;x++){
        return b;
    }//int[][] rotateImage(int[][] a) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 100,
a[i].length = a.length,
1 ≤ a[i][j] ≤ 104.

[output] array.array.integer
     */

}//public class RotateImage {
