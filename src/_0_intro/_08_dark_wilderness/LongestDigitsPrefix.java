/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._08_dark_wilderness;

import static java.lang.Character.isDigit;

public class LongestDigitsPrefix {

/*
Given a string, output its longest
prefix which contains only digits.
 */

    String longestDigitsPrefix(String inputString) {
        return (inputString+".0").split("[\\D]")[0];
    }//String longestDigitsPrefix(String inputString) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

Guaranteed constraints:
3 ≤ inputString.length ≤ 100.

[output] string
 */

}//public class LongestDigitsPrefix {
