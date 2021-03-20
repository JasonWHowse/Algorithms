namespace Algorithms.src._0_intro._03_exploring_the_waters {
    public class AreSimilar {

        /*

Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

Given two arrays a and b, check whether they are similar.

Example

For a = [1, 2, 3] and b = [1, 2, 3], the output should be
areSimilar(a, b) = true.

The arrays are equal, no need to swap any elements.

For a = [1, 2, 3] and b = [2, 1, 3], the output should be
areSimilar(a, b) = true.

We can obtain b from a by swapping 2 and 1 in b.

For a = [1, 2, 2] and b = [2, 1, 1], the output should be
areSimilar(a, b) = false.

Any swap of any two elements either in a or in b won't make a and b equal.

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer a

Array of integers.

Guaranteed constraints:
3 ≤ a.length ≤ 105,
1 ≤ a[i] ≤ 1000.

[input] array.integer b

Array of integers of the same length as a.

Guaranteed constraints:
b.length = a.length,
1 ≤ b[i] ≤ 1000.

[output] boolean

true if a and b are similar, false otherwise.

        */

        public
        bool areSimilar(int[] a, int[] b) {
            int c = -1, d = -1;
            for (int i = 0; i < a.Length && i < b.Length; i++) {
                if (a[i] != b[i]) {
                    if (c == -1) {
                        c = i;
                    } else if (d == -1) {//if (c == -1) {
                        d = i;
                    } else {//else if (d == -1) {
                        return false;
                    }//else {
                }//if (a[i] != b[i]) {
            }//for (int i = 0; i < a.Length && i < b.Length; i++) {
            return d == -1 || (b[c] == a[d] && b[d] == a[c]);
        }//bool areSimilar(int[] a, int[] b) {
    }//public class AreSimilar {
}//namespace Algorithms.src._0_intro._03_exploring_the_waters {
