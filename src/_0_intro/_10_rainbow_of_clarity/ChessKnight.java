/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._10_rainbow_of_clarity;

public class ChessKnight {

/*
Given a position of a knight on the standard
chessboard, find the number of different
moves the knight can perform.

The knight can move to a square that is two
squares horizontally and one square
vertically, or two squares vertically and one
square horizontally away from it. The
complete move therefore looks like the letter
L. Check out the image below to see all valid
moves for a knight piece that is placed on one
of the central squares.
 */

    int chessKnight(String cell) {
        return 
        (cell.charAt(0)+2<'i'&&cell.charAt(1)-1>'0'?1:0)+
        (cell.charAt(0)+2<'i'&&cell.charAt(1)+1<'9'?1:0)+
        (cell.charAt(0)+1<'i'&&cell.charAt(1)-2>'0'?1:0)+
        (cell.charAt(0)+1<'i'&&cell.charAt(1)+2<'9'?1:0)+
        (cell.charAt(0)-2>'`'&&cell.charAt(1)-1>'0'?1:0)+
        (cell.charAt(0)-2>'`'&&cell.charAt(1)+1<'9'?1:0)+
        (cell.charAt(0)-1>'`'&&cell.charAt(1)-2>'0'?1:0)+
        (cell.charAt(0)-1>'`'&&cell.charAt(1)+2<'9'?1:0);
    }//int chessKnight(String cell) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string cell

String consisting of 2 letters - coordinates of the knight on an 8 × 8 chessboard in chess notation.

Guaranteed constraints:
cell.length = 2,
'a' ≤ cell[0] ≤ 'h',
1 ≤ cell[1] ≤ 8.

[output] integer
 */

}//public class ChessKnight {
