/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._0_Arrays;

import java.util.Dictionary;
import java.util.Hashtable;

public class IsCryptSolution {

    /*

A cryptarithm is a mathematical puzzle for which the goal is to find the correspondence between letters and digits, such that the given arithmetic equation consisting of letters holds true when the letters are converted to digits.

You have an array of strings crypt, the cryptarithm, and an an array containing the mapping of letters and digits, solution. The array crypt will contain three non-empty strings that follow the structure: [word1, word2, word3], which should be interpreted as the word1 + word2 = word3 cryptarithm.

If crypt, when it is decoded by replacing all of the letters in the cryptarithm with digits using the mapping in solution, becomes a valid arithmetic equation containing no numbers with leading zeroes, the answer is true. If it does not become a valid arithmetic solution, the answer is false.

Note that number 0 doesn't contain leading zeroes (while for example 00 or 0123 do).

     */

    boolean isCryptSolution(String[] c, char[][] s) {
        Dictionary<Character, Integer> dict = new Hashtable<>();
        int[] output = new int[3];
        for(char[] cArr : s) {
            dict.put(cArr[0], cArr[1]-48);
        }//for(char[] cArr : s) {
        for (int i=0;i<3;i++) {
            if (dict.get(c[i].charAt(0)) == 0 && c[i].length() != 1) {
                return false;
            }//if (dict.get(c[i].charAt(0)) == 0 && c[i].length() != 1) {
            int mult = 10;
            output[i] = 0;
            for(char ch : c[i].toCharArray()) {
                output[i] = output[i] * mult + dict.get(ch);
            }//for(char ch : c[i].toCharArray()) {
        }//for (int i=0;i<3;i++) {
        return output[0]+output[1]==output[2];
    }//boolean isCryptSolution(String[] c, char[][] s) {

    /*

Input/Output

[execution time limit] 3 seconds (java)

[input] array.string crypt

An array of three non-empty strings containing only uppercase English letters.

Guaranteed constraints:
crypt.length = 3,
1 ≤ crypt[i].length ≤ 14.

[input] array.array.char solution

An array consisting of pairs of characters that represent the correspondence between letters and numbers in the cryptarithm. The first character in the pair is an uppercase English letter, and the second one is a digit in the range from 0 to 9.

It is guaranteed that solution only contains entries for the letters present in crypt and that different letters have different values.

Guaranteed constraints:
solution[i].length = 2,
'A' ≤ solution[i][0] ≤ 'Z',
'0' ≤ solution[i][1] ≤ '9',
solution[i][0] ≠ solution[j][0], i ≠ j,
solution[i][1] ≠ solution[j][1], i ≠ j.

[output] boolean

Return true if the solution represents the correct solution to the cryptarithm crypt, otherwise return false.

     */

}//public class IsCryptSolution {
