/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._06_boom_market;

public class IsTandemRepeat {

    /*
Determine whether the given string can be obtained by one concatenation of some string to itself.
     */

    boolean isTandemRepeat(String inputString) {
        return inputString.equals(inputString.substring(inputString.length()/2).repeat(2));
    }//boolean isTandemRepeat(String inputString) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

Guaranteed constraints:
2 ≤ inputString.length ≤ 20.

[output] boolean

true if inputString represents a string concatenated to itself, false otherwise.
     */

}//public class IsTandemRepeat {
