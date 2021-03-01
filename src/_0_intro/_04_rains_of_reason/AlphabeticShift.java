/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_rains_of_reason;

public class AlphabeticShift {

/*
Given a string, your task is to replace each of its
characters by the next one in the English alphabet;
i.e. replace a with b, replace b with c, etc (z
would be replaced by a).
 */

    String alphabeticShift(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        for(int i=0;i<sb.length();i++){
            char t=sb.charAt(i);
            if(t=='z'){
                sb.setCharAt(i,'a');
            }else {//if(t=='z'){
                sb.setCharAt(i,++t);
            }//else{
        }//for(int i=0;i<sb.length();i++){
        return sb.toString();
    }//String alphabeticShift(String inputString) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] string inputString

A non-empty string consisting of lowercase English characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 1000.

[output] string

The resulting string after replacing each of its characters.
 */

}//public class AlphabeticShift {