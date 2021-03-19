/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._00_the_journey_begins;

public class CheckPalindrome {
/*
Given the string, check if it is a palindrome
 */

    boolean checkPalindrome(String inputString) {
        return inputString.equals(new StringBuilder(inputString).reverse().toString());
    }//boolean checkPalindrome(String inputString) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A non-empty string consisting of lowercase characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 105.

[output] boolean

true if inputString is a palindrome, false otherwise.
 */

}//public class CheckPalindrome {