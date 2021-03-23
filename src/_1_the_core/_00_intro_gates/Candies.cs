namespace Algorithms.src._1_the_core._00_intro_gates {
    public class Candies {

        /*

n children have got m pieces of candy. They want to eat as much candy as they can, but each child must eat exactly the same amount of candy as any other child. Determine how many pieces of candy will be eaten by all the children together. Individual pieces of candy cannot be split.

Example

For n = 3 and m = 10, the output should be
candies(n, m) = 9.

Each child will eat 3 pieces. So the answer is 9.

Input/Output

[execution time limit] 3 seconds (cs)

[input] integer n

The number of children.

Guaranteed constraints:
1 ≤ n ≤ 10.

[input] integer m

The number of pieces of candy.

Guaranteed constraints:
2 ≤ m ≤ 100.

[output] integer

The total number of pieces of candy the children will eat provided they eat as much as they can and all children eat the same amount.

        */

        public
        int candies(int n, int m) {
            return m - m % n;
        }//int candies(int n, int m) {
    }//public class Candies {
}//namespace Algorithms.src._1_the_core._00_intro_gates {
