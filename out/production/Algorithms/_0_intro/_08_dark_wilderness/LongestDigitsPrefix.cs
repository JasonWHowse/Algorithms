using System.Text.RegularExpressions;

namespace Algorithms.src._0_intro._08_dark_wilderness {
    public class LongestDigitsPrefix {

        /*

Given a string, output its longest prefix which contains only digits.

Example

For inputString = "123aa1", the output should be
longestDigitsPrefix(inputString) = "123".

Input/Output

[execution time limit] 3 seconds (cs)

[input] string inputString

Guaranteed constraints:
3 ≤ inputString.length ≤ 100.

[output] string
        
        */

        public
        string longestDigitsPrefix(string inputString) {
            return new Regex("[\\D]").Split(inputString+".0")[0];
        }//String longestDigitsPrefix(String inputString) {
    }//public class LongestDigitsPrefix {
}//namespace Algorithms.src._0_intro._08_dark_wilderness {
