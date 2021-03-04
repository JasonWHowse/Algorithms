/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._09_eruption_of_light;


public class IsBeautifulString {

/*
A string is said to be beautiful if each letter
in the string appears at most as many times as
the previous letter in the alphabet within the
string; ie: b occurs no more times than a; c
occurs no more times than b; etc. Note that
letter a has no previous letter.

Given a string, check whether it is beautiful.
 */

    boolean isBeautifulString(String inputString) {
        int lastCount=inputString.length();
        for(char i='a';i<='z';i++){
            int i1 = inputString.length()-inputString.replace(String.valueOf(i), "").length();
            if(lastCount< i1){
                return false;
            }//if(lastCount< i1){
            lastCount= i1;
        }//for(char i='a';i<='z';i++){
        return true;
    }//boolean isBeautifulString(String inputString) {
/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A string of lowercase English letters.

Guaranteed constraints:
3 ≤ inputString.length ≤ 50.

[output] boolean

Return true if the string is beautiful, false otherwise.
 */

}//public class IsBeautifulString {
