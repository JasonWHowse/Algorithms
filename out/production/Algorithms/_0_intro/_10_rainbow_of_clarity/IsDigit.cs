namespace Algorithms.src._0_intro._10_rainbow_of_clarity {
    public class IsDigit {

        /*

Determine if the given character is a digit or not.

Example

For symbol = '0', the output should be
isDigit(symbol) = true;
For symbol = '-', the output should be
isDigit(symbol) = false.
Input/Output

[execution time limit] 3 seconds (cs)

[input] char symbol

A character which is either a digit or not.

Guaranteed constraints:
Given symbol is from ASCII table.

[output] boolean

true if symbol is a digit, false otherwise.

        */

        public
        bool isDigit(char symbol) {
            return char.IsDigit(symbol);
        }//bool isDigit(char symbol) {
    }//public class IsDigit {
}//namespace Algorithms.src._0_intro._10_rainbow_of_clarity {
