/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._06_book_market;

public class IsCaseInsensitivePalindrome {

    /*
Given a string, check if it can become a palindrome through a case change of some (possibly, none) letters.
     */

    boolean isCaseInsensitivePalindrome(String inputString) {
        return inputString.equalsIgnoreCase(new StringBuilder(inputString).reverse().toString());
    }//boolean isCaseInsensitivePalindrome(String inputString) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

Non-empty string consisting of English letters.

Guaranteed constraints:
4 ≤ inputString.length ≤ 10.

[output] boolean
     */

}//public class IsCaseInsensitivePalindrome {
