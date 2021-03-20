﻿namespace Algorithms.src._0_intro._03_exploring_the_waters {
    public class AlternatingSums {

        /*

Several people are standing in a row and need to be divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.

You are given an array of positive integers - the weights of the people. Return an array of two integers, where the first element is the total weight of team 1, and the second element is the total weight of team 2 after the division is complete.

Example

For a = [50, 60, 60, 45, 70], the output should be
alternatingSums(a) = [180, 105].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

Guaranteed constraints:
1 ≤ a.length ≤ 105,
45 ≤ a[i] ≤ 100.

[output] array.integer

        */

        public
        int[] alternatingSums(int[] a) {
            int t1C = 0, t2C = 0;
            for (int i = 0; i < a.Length; i++) {
                if (i % 2 == 0) {
                    t1C += a[i];
                } else {//if (i % 2 == 0) {
                    t2C += a[i];
                }//else {
            }//for (int i = 0; i < a.Length; i++) {
            return new int[] { t1C, t2C };
        }//int[] alternatingSums(int[] a) {
    }//public class AlternatingSums {
}//namespace Algorithms.src._0_intro._03_exploring_the_waters {
