using System.Collections.Generic;
using System.Linq;

namespace Algorithms.src._0_intro._04_island_of_knowledge {
    public class AvoidObstacles {

        /*

You are given an array of integers representing coordinates of obstacles situated on a straight line.

Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.

Find the minimal length of the jump enough to avoid all the obstacles.

Example

For inputArray = [5, 3, 6, 7, 9], the output should be
avoidObstacles(inputArray) = 4.

Check out the image below for better understanding:



Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer inputArray

Non-empty array of positive integers.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 1000,
1 ≤ inputArray[i] ≤ 1000.

[output] integer

The desired length.

        */

        public
        int avoidObstacles(int[] inputArray) {
            HashSet<int> hS = new HashSet<int>();
            foreach (int a in inputArray) {
                hS.Add(a);
            }//foreach (int a in inputArray) {
            for (int i = 1; i <= hS.ToArray().Max() + 1; i++) {
                bool flag = false;
                if (!hS.Contains(i)) {
                    foreach (int a in inputArray) {
                        if (a % i == 0) {
                            flag = false;
                            break;
                        } else {//if (a % i == 0) {
                            flag = true;
                        }//else {//
                    }//foreach (int a in inputArray) {
                    if (flag) {
                        return i;
                    }//if (flag) {
                }//if (!hS.Contains(i)) {
            }//for (int i = 1; i <= hS.ToArray().Max() + 1; i++) {
            return -1;
        }//int avoidObstacles(int[] inputArray) {
    }//public class AvoidObstacles {
}//namespace Algorithms.src._0_intro._04_island_of_knowledge {
