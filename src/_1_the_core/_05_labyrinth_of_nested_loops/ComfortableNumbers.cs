namespace Algorithms.src._1_the_core._05_labyrinth_of_nested_loops {
    public class ComfortableNumbers {

        /*

Let's say that number a feels comfortable with number b if a ≠ b and b lies in the segment [a - s(a), a + s(a)], where s(x) is the sum of x's digits.

How many pairs (a, b) are there, such that a < b, both a and b lie on the segment [l, r], and each number feels comfortable with the other (so a feels comfortable with b and b feels comfortable with a)?

Example

For l = 10 and r = 12, the output should be
comfortableNumbers(l, r) = 2.

Here are all values of s(x) to consider:

s(10) = 1, so 10 is comfortable with 9 and 11;
s(11) = 2, so 11 is comfortable with 9, 10, 12 and 13;
s(12) = 3, so 12 is comfortable with 9, 10, 11, 13, 14 and 15.
Thus, there are 2 pairs of numbers comfortable with each other within the segment [10; 12]: (10, 11) and (11, 12).

Input/Output

[execution time limit] 3 seconds (cs)

[input] integer l

Guaranteed constraints:
1 ≤ l ≤ r ≤ 1000.

[input] integer r

Guaranteed constraints:
1 ≤ l ≤ r ≤ 1000.

[output] integer

The number of pairs satisfying all the above conditions.

        */

        public
        int comfortableNumbers(int l, int r) {
            int output = 0;
            for (int i = l; i <= r; i++) {
                for (int j = i + 1; j <= r; j++) {
                    if (i <= j + Adjuster(j) && i >= j - Adjuster(j) && j <= i + Adjuster(i) && j >= i - Adjuster(i)) {
                        output++;
                    }//if (i <= j + (int)HT[j] && i >= j - (int)HT[j] && j <= i + (int)HT[i] && j >= i - (int)HT[i]) {
                }//for (int j = i+1; j <= r; j++) {
            }//for(int i = l; i <= r; i++) {
            return output;
        }//int comfortableNumbers(int l, int r) {

        private
        int Adjuster(int n) {
            int a = 0;
            for (; n > 0; n /= 10) {
                a += n % 10;
            }//for (; n > 0; n /= 10) {
            return a;
        }//int Adjuster(int n) {
    }//public class ComfortableNumbers {
}//namespace Algorithms.src._1_the_core._05_labyrinth_of_nested_loops {
