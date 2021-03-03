/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._06_diving_deeper;
import static java.lang.Character.isDigit;

public class FirstDigit {

/*
Find the leftmost digit that occurs in a given string.
 */

    char firstDigit(String inputString) {
        for(int i=0;i<inputString.length();i++){
            if(isDigit(inputString.charAt(i))){
                return inputString.charAt(i);
            }//if(isDigit(inputString.charAt(i))){
        }//for(int i=0;i<inputString.length();i++){
        return 'n';
    }//char firstDigit(String inputString) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A string containing at least one digit.

Guaranteed constraints:
3 ≤ inputString.length ≤ 10.

[output] char
 */

}//public class FirstDigit {
