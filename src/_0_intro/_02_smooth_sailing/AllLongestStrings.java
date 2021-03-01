/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._02_smooth_sailing;

import java.util.ArrayList;

public class AllLongestStrings {
/*
Given an array of strings, return another array
containing all of its longest strings.
 */

    String[] allLongestStrings(String[] inputArray) {
        ArrayList<String> output = new ArrayList<>();
        output.add(inputArray[0]);
        for(int i=1;i<inputArray.length;i++){
            if(output.get(0).length()<inputArray[i].length()){
                output=new ArrayList<>();
                output.add(inputArray[i]);
            }else if(output.get(0).length()==inputArray[i].length()){//if(output.get(0).length()<inputArray[i].length()){
                output.add(inputArray[i]);
            }//else if(output.get(0).length()==inputArray[i].length()){
        }//for(int i=1;i<inputArray.length;i++){
        return output.toArray(new String[0]);
    }//String[] allLongestStrings(String[] inputArray) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 10.

[output] array.string

Array of the longest strings, stored in the same order as in the inputArray.
 */

}//public class AllLongestStrings {
