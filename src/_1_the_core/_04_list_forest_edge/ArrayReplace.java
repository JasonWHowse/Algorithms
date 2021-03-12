/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

public class ArrayReplace {

    /*
Given an array of integers, replace all the occurrences of
elemToReplace with substitutionElem.
     */

    int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]==elemToReplace){
                inputArray[i]=substitutionElem;
            }//if(inputArray[i]==elemToReplace){
        }//for(int i=0;i<inputArray.length;i++){
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
