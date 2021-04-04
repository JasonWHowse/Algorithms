using System.Collections.Generic;
using System.Text.RegularExpressions;

namespace Algorithms.src._0_intro._02_smooth_sailing {
    public class CommonCharacterCount {

        /*

Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

Input/Output

[execution time limit] 3 seconds (cs)

[input] string s1

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s1.length < 15.

[input] string s2

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s2.length < 15.

[output] integer

        */

        public
        int commonCharacterCount(string s1, string s2) {
            int count = 0;
            for (int i = 0; i < s1.Length; i++) {
                int index = s2.IndexOf(s1[i]);
                if (index != -1) {
                    s2 = new Regex(s2[index]+"").Replace(s2, "", 1);
                    count++;
                }//if(index!=-1){
            }//for(int i=0; i<s1.length();i++){
            return count;
        }//int commonCharacterCount(String s1, String s2) {
    }//public class CommonCharacterCount {
}//namespace Algorithms.src._0_intro._02_smooth_sailing {
