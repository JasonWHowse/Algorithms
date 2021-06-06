/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._08_dark_wilderness;

public class GrowingPlant {

/*
Caring for a plant can be hard work, but
since you tend to it regularly, you have a
plant that grows consistently. Each day,
its height increases by a fixed amount
represented by the integer upSpeed. But
due to lack of sunlight, the plant
decreases in height every night, by an
amount represented by downSpeed.

Since you grew the plant from a seed, it
started at height 0 initially. Given an
integer desiredHeight, your task is to find
how many days it'll take for the plant to
reach this height.
 */

    int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int time=1;
        while(time*(upSpeed-downSpeed)+downSpeed<desiredHeight){
            time++;
        }//while(time*(upSpeed-downSpeed)<desiredHeight-downSpeed){
        return time;
    }//int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer upSpeed

A positive integer representing the daily growth of the plant.

Guaranteed constraints:
3 ≤ upSpeed ≤ 100.

[input] integer downSpeed

A positive integer representing the nightly decline of the plant.

Guaranteed constraints:
2 ≤ downSpeed < upSpeed.

[input] integer desiredHeight

A positive integer representing the goal height.

Guaranteed constraints:
4 ≤ desiredHeight ≤ 1000.

[output] integer

The number of days that it will take for the plant to reach / pass desiredHeight.
 */

}//public class GrowingPlant {
