namespace Algorithms.src._0_intro._05_rains_of_reason {
    public class EvenDigitsOnly {

        /*

Check if all digits of the given integer are even.

Example

For n = 248622, the output should be
evenDigitsOnly(n) = true;
For n = 642386, the output should be
evenDigitsOnly(n) = false.
Input/Output

[execution time limit] 3 seconds (cs)

[input] integer n

Guaranteed constraints:
1 ≤ n ≤ 109.

[output] boolean

true if all digits of n are even, false otherwise.

        */

        public
        bool evenDigitsOnly(int n) {
            while (n != 0) {
                if ((n % 10) % 2 == 1) {
                    return false;
                }//if((n%10)%2==1){
                n = n / 10;
            }//while (n!=0){
            return true;
        }//bool evenDigitsOnly(int n) {
    }//public class EvenDigitsOnly {
}//namespace Algorithms.src._0_intro._05_rains_of_reason {
