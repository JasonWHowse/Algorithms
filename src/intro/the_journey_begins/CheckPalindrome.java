/*
 * Authored by: Jason Wesley Howse
 */

package intro.the_journey_begins;

public class CheckPalindrome {
/*
Given the string, check if it is a palindrome
 */

    boolean checkPalindrome(String inputString) {
        int sLen = inputString.length() - 1;
        for (int i = 0; i < (sLen + 1) / 2; i++) {
            if (inputString.charAt(i) != (inputString.charAt(sLen - i))) {
                return false;
            }//if (inputString.charAt(i) != (inputString.charAt((sLen - 1) - i))) {
        }//for (int i = 0; i < sLen / 2; i++) {
        return true;
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