/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_rains_of_reason;

public class ArrayReplace {

/*
Given an array of integers, replace all the occurrences of
elemToReplace with substitutionElem.
 */

    int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        for (int i = 0; i < inputArray.length; i++) {
            if (elemToReplace == inputArray[i]) {
                inputArray[i] = substitutionElem;
            }//if (elemToReplace == inputArray[i]) {
        }//for (int i = 0; i < inputArray.length; i++) {
        return inputArray;
    }//int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Guaranteed constraints:
0 ≤ inputArray.length ≤ 104,
0 ≤ inputArray[i] ≤ 109.

[input] integer elemToReplace

Guaranteed constraints:
0 ≤ elemToReplace ≤ 109.

[input] integer substitutionElem

Guaranteed constraints:
0 ≤ substitutionElem ≤ 109.

[output] array.integer
*/

}//public class ArrayReplace {