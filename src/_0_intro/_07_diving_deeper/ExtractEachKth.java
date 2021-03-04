/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._07_diving_deeper;

import java.util.Arrays;

public class ExtractEachKth {

/*
Given array of integers, remove each kth
element from it.
 */

int[] extractEachKth(int[] inputArray, int k) {
    for(int i=0,j=0;i<inputArray.length;i++){
        if((i+1)%k!=0){
            inputArray[j++]=inputArray[i];
        }//if((i+1)%k!=0){
    }//for(int i=0,j=0;i<inputArray.length;i++){
    return Arrays.copyOfRange(inputArray,
            0,
            inputArray.length-(inputArray.length/k));
}//int[] extractEachKth(int[] inputArray, int k) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

Guaranteed constraints:
5 ≤ inputArray.length ≤ 15,
-20 ≤ inputArray[i] ≤ 20.

[input] integer k

Guaranteed constraints:
1 ≤ k ≤ 10.

[output] array.integer

inputArray without elements k - 1, 2k - 1, 3k - 1 etc.
 */

}//public class ExtractEachKth {


