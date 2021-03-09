/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

public class TennisSet {

    /*
In tennis, the winner of a set is based on how many
games each player wins. The first player to win 6
games is declared the winner unless their opponent
had already won 5 games, in which case the set
continues until one of the players has won 7 games.

Given two integers score1 and score2, your task is
to determine if it is possible for a tennis set to
be finished with a final score of score1 : score2.
     */

    boolean tennisSet(int score1, int score2) {
        int max=Math.max(score1,score2);
        int min=Math.min(score1,score2);
        return max==6&&min<5||max==7&&(min==6||min==5);
    }//boolean tennisSet(int score1, int score2) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer score1

Number of games won by the 1st player, non-negative integer.

Guaranteed constraints:
0 ≤ score1 ≤ 10.

[input] integer score2

Number of games won by the 2nd player, non-negative integer.

Guaranteed constraints:
0 ≤ score2 ≤ 10.

[output] boolean

true if score1 : score2 represents a possible score for an ended set, false otherwise.
     */

}//public class TennisSet {
