/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._09_eruption_of_light;

public class BuildPalindrome {

/*
Given a string, find the shortest possible
string which can be achieved by adding
characters to the end of initial string to
make it a palindrome.
 */

    String buildPalindrome(String st) {
        for(int i=-1;i<st.length();i++){
            if((st.substring(i+1).equals((new StringBuilder(st)).reverse().substring(0,st.length()-i-1)))){
                return st+new StringBuilder(st).reverse().substring(st.length()-i-1);
            }//if((st.substring(i+1).equals((new StringBuilder(st)).reverse().substring(0,st.length()-i-1)))){
        }//for(int i=-1;i<st.length();i++){
        return st;
    }//String buildPalindrome(String st) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string st

A string consisting of lowercase English letters.

Guaranteed constraints:
3 ≤ st.length ≤ 10.

[output] string
 */

}//public class BuildPalindrome {
