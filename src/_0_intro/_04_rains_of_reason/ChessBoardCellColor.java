/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_rains_of_reason;

public class ChessBoardCellColor {

/*
Given two cells on the standard chess board,
determine whether they have the same color
or not.
 */

    boolean chessBoardCellColor(String cell1, String cell2) {
        return (cell1.charAt(0)+cell1.charAt(1))%2 == (cell2.charAt(0)+cell2.charAt(1))%2;
    }//boolean chessBoardCellColor(String cell1, String cell2) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string cell1

Guaranteed constraints:
cell1.length = 2,
'A' ≤ cell1[0] ≤ 'H',
1 ≤ cell1[1] ≤ 8.

[input] string cell2

Guaranteed constraints:
cell2.length = 2,
'A' ≤ cell2[0] ≤ 'H',
1 ≤ cell2[1] ≤ 8.

[output] boolean

true if both cells have the same color, false otherwise.
 */

}
