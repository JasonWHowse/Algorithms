using System.Text.RegularExpressions;

namespace Algorithms.src._0_intro._11_land_of_logic {
    public class SumUpNumbers {

        /*

CodeMaster has just returned from shopping. He scanned the check of the items he bought and gave the resulting string to Ratiorg to figure out the total number of purchased items. Since Ratiorg is a bot he is definitely going to automate it, so he needs a program that sums up all the numbers which appear in the given input.

Help Ratiorg by writing a function that returns the sum of numbers that appear in the given inputString.

Example

For inputString = "2 apples, 12 oranges", the output should be
sumUpNumbers(inputString) = 14.

Input/Output

[execution time limit] 3 seconds (cs)

[input] string inputString

Guaranteed constraints:
0 ≤ inputString.length ≤ 105.

[output] integer

        */

        public
        int sumUpNumbers(string inputString) {
            int output = 0;
            foreach(string s in new Regex("\\D").Split(inputString)) {
                int number = 0;
                int.TryParse(s, out number);
                output += number;
            }//foreach(string s in new Regex("\\D").Split(inputString)) {
            return output;
        }//int sumUpNumbers(string inputString) {
    }//public class SumUpNumbers {
}//namespace Algorithms.src._0_intro._11_land_of_logic {
