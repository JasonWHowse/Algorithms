/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures;

public class FirstNotRepeatingCharacter {

    /*

Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.

     */

    char firstNotRepeatingCharacter(String s) {
        s=" "+s+" ";
        char b = '_';
        int l = 0;
        String[] sArr;
        for (char i = 'a'; i <= 'z'; i++) {
            sArr = s.split(i+"");
            if (sArr.length == 2) {
                if (sArr[0].length() < l || l == 0) {
                    l = sArr[0].length();
                    b = i;
                }//if (sArr[0].length() < l || l == 0) {
            }//if (sArr.length == 2) {
        }//for (char i = 'a'; i <= 'z'; i++) {
        return b;
    }//char firstNotRepeatingCharacter(string s) {

    /*

Input/Output

[execution time limit] 3 seconds (java)

[input] string s

A string that contains only lowercase English letters.

Guaranteed constraints:
1 ≤ s.length ≤ 105.

[output] char

The first non-repeating character in s, or '_' if there are no characters that do not repeat.

     */

}//public class FirstNotRepeatingCharacter {
