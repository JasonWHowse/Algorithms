namespace Algorithms.src._0_intro._02_smooth_sailing {
    public class IsLucky {

        /*

Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.
Input/Output

[execution time limit] 3 seconds (cs)

[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 ≤ n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.

        */

        public
        bool isLucky(int n) {
            int output = 0;
            int len = n.ToString().Length;
            for (int i = 0; i < len; i++) {
                if (i < len / 2) {
                    output += n % 10;
                } else {//if (i<len/ 2) {
                    output -= n % 10;
                }//else {
                n /= 10;
            }//for (int i = 0; i < len; i++) {
            return output == 0;
        }//bool isLucky(int n) {
    }//public class IsLucky {
}//namespace Algorithms.src._0_intro._02_smooth_sailing {