﻿namespace Algorithms.src._0_intro._08_dark_wilderness {
    public class DigitDegree {

        /*

Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.

Given an integer, find its digit degree.

Example

For n = 5, the output should be
digitDegree(n) = 0;
For n = 100, the output should be
digitDegree(n) = 1.
1 + 0 + 0 = 1.
For n = 91, the output should be
digitDegree(n) = 2.
9 + 1 = 10 -> 1 + 0 = 1.
Input/Output

[execution time limit] 3 seconds (cs)

[input] integer n

Guaranteed constraints:
5 ≤ n ≤ 109.

[output] integer

        */

        public
        int digitDegree(int n) {
            int count = 0;
            while (n >= 10) {
                int currentSum = 0;
                while (n != 0) {
                    currentSum += n % 10;
                    n /= 10;
                }//while(n!=0){
                n = currentSum;
                count++;
            }//while(n>=10){
            return count;
        }//int digitDegree(int n) {
    }//public class DigitDegree {
}//namespace Algorithms.src._0_intro._08_dark_wilderness {
