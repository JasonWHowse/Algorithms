namespace Algorithms.src._0_intro._07_diving_deeper {
    public class FirstDigit {

        /*

Find the leftmost digit that occurs in a given string.

Example

For inputString = "var_1__Int", the output should be
firstDigit(inputString) = '1';
For inputString = "q2q-q", the output should be
firstDigit(inputString) = '2';
For inputString = "0ss", the output should be
firstDigit(inputString) = '0'.
Input/Output

[execution time limit] 3 seconds (cs)

[input] string inputString

A string containing at least one digit.

Guaranteed constraints:
3 ≤ inputString.length ≤ 10.

[output] char

        */

        public
        char firstDigit(string inputString) {
            foreach (char ch in inputString) {
                /*if (ch >= '0' && ch <= '9') {*/
                if (char.IsDigit(ch)) { 
                    return ch;
                }//if (char.IsDigit(ch)) { 
            }//foreach (char ch in inputString) {
            return 'n';
        }//char firstDigit(string inputString) {
    }//public class FirstDigit {
}//namespace Algorithms.src._0_intro._07_diving_deeper {
