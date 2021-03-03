/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_island_of_knowledge;

public class BoxBlur {

    /*
Last night you partied a little too hard. Now there's a black
and white photo of you that's about to go viral! You can't let
this ruin your reputation, so you want to apply the box blur
algorithm to the photo to hide its content.

The pixels in the input image are represented as integers. The
algorithm distorts the input image in the following way: Every
pixel x in the output image has a value equal to the average
value of the pixel values from the 3 × 3 square that has its
center at x, including x itself. All the pixels on the border of
x are then removed.

Return the blurred image as an integer, with the fractions
rounded down.
     */

    int[][] boxBlur(int[][] image) {
        int[][] oImage=new int[image.length-2][image[0].length-2];
        for(int x=0;x<oImage.length;x++){
            for(int y=0;y<oImage[x].length;y++){
                oImage[x][y]=(image[x][y]+image[x+1][y]+image[x+2][y]
                             +image[x][y+1]+image[x+1][y+1]+image[x+2][y+1]
                             +image[x][y+2]+image[x+1][y+2]+image[x+2][y+2])/9;
            }//for(int y=0;y<oImage[x].length;y++){
        }//for(int x=0;x<oImage.length;x++){
        return oImage;
    }//int[][] boxBlur(int[][] image) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.integer image

An image, stored as a rectangular matrix of non-negative integers.

Guaranteed constraints:
3 ≤ image.length ≤ 100,
3 ≤ image[0].length ≤ 100,
0 ≤ image[i][j] ≤ 255.

[output] array.array.integer

A blurred image represented as integers, obtained through the process in the description.
     */

}//public class BoxBlur {
