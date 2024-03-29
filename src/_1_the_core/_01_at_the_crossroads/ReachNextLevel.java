/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

public class ReachNextLevel {

    /*
You are playing an RPG game. Currently your experience
points (XP) total is equal to experience. To reach the
next level your XP should be at least at threshold. If
you kill the monster in front of you, you will gain more
experience points in the amount of the reward.

Given values experience, threshold and reward, check
if you reach the next level after killing the monster.
     */

    boolean reachNextLevel(int experience, int threshold, int reward) {
        return experience+reward>=threshold;
    }//boolean reachNextLevel(int experience, int threshold, int reward) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer experience

Guaranteed constraints:
3 ≤ experience ≤ 250.

[input] integer threshold

Guaranteed constraints:
5 ≤ threshold ≤ 300.

[input] integer reward

Guaranteed constraints:
2 ≤ reward ≤ 65.

[output] boolean

true if you reach the next level, false otherwise.
     */

}//public class ReachNextLevel {
