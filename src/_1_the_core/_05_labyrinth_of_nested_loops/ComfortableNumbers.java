/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

public class ComfortableNumbers {

    /*
Let's say that number a feels comfortable with number
b if a ≠ b and b lies in the segment [a - s(a),
a + s(a)], where s(x) is the sum of x's digits.

How many pairs (a, b) are there, such that a < b, both
a and b lie on the segment [l, r], and each number
feels comfortable with the other (so a feels
comfortable with b and b feels comfortable with a)?
     */

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

    private int Adjuster(int n) {
        int a = 0;
        for (; n > 0; n /= 10) {
            a += n % 10;
        }//for (; n > 0; n /= 10) {
        return a;
    }//int Adjuster(int n) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer l

Guaranteed constraints:
1 ≤ l ≤ r ≤ 1000.

[input] integer r

Guaranteed constraints:
1 ≤ l ≤ r ≤ 1000.

[output] integer

The number of pairs satisfying all the above conditions.
     */

}//public class ComfortableNumbers {
