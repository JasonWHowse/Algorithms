using System.Collections.Generic;

namespace Algorithms.src._0_intro._02_smooth_sailing {
    public class AllLongestStrings {

        /*

Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 10.

[output] array.string

Array of the longest strings, stored in the same order as in the inputArray.

        */

        public
        string[] allLongestStrings(string[] inputArray) {
            List<string> output = new List<string>();
            int maxLength = 0;
            foreach (var a in inputArray) {
                if (maxLength < a.Length) {
                    maxLength = a.Length;
                    output.Clear();
                }//if (maxLength < a.Length) {
                if (maxLength == a.Length) {
                    output.Add(a);
                }//if (maxLength == a.Length) {
            }//foreach(var a in inputArray) {
            return output.ToArray();
        }//string[] allLongestStrings(string[] inputArray) {
    }//public class AllLongestStrings {
}//namespace Algorithms.src._0_intro._02_smooth_sailing {