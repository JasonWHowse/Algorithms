namespace Algorithms.src._0_intro._10_rainbow_of_clarity {
    public class DeleteDigit {

        /*

Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.

Example

For n = 152, the output should be
deleteDigit(n) = 52;
For n = 1001, the output should be
deleteDigit(n) = 101.
Input/Output

[execution time limit] 3 seconds (cs)

[input] integer n

Guaranteed constraints:
10 ≤ n ≤ 106.

[output] integer

        */

        public
        int deleteDigit(int n) {
            int max = 0;
            for (int i = 1; i < n; i *= 10) {
                max = System.Math.Max(max, (n % (i)) + ((n / (i * 10)) * i));
            }//for(int i=1;i<n;i*=10){
            return max;
        }//int deleteDigit(int n) {
    }//public class DeleteDigit {
}//namespace Algorithms.src._0_intro._10_rainbow_of_clarity {
