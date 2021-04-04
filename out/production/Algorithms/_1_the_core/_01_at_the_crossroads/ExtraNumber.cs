﻿namespace Algorithms.src._1_the_core._01_at_the_crossroads {
    public class ExtraNumber {

        /*

You're given three integers, a, b and c. It is guaranteed that two of these integers are equal to each other. What is the value of the third integer?

Example

For a = 2, b = 7, and c = 2, the output should be
extraNumber(a, b, c) = 7.

The two equal numbers are a and c. The third number (b) equals 7, which is the answer.

Input/Output

[execution time limit] 3 seconds (cs)

[input] integer a

Guaranteed constraints:
1 ≤ a ≤ 109.

[input] integer b

Guaranteed constraints:
1 ≤ b ≤ 109.

[input] integer c

Guaranteed constraints:
1 ≤ c ≤ 109.

[output] integer

        */

        public
        int extraNumber(int a, int b, int c) {
            return (a == b) ? c : (a == c) ? b : a;
        }//int extraNumber(int a, int b, int c) {
    }//public class ExtraNumber {
}//namespace Algorithms.src._1_the_core._01_at_the_crossroads {
