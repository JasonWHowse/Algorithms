using System;
using System.Collections.Generic;
using System.Linq;

namespace Algorithms.src._1_the_core._07_mirror_lake {
    public class ConstructSquare {

        /*

Given a string consisting of lowercase English letters, find the largest square number which can be obtained by reordering the string's characters and replacing them with any digits you need (leading zeros are not allowed) where same characters always map to the same digits and different characters always map to different digits.

If there is no solution, return -1.

Example

For s = "ab", the output should be
constructSquare(s) = 81.
The largest 2-digit square number with different digits is 81.
For s = "zzz", the output should be
constructSquare(s) = -1.
There are no 3-digit square numbers with identical digits.
For s = "aba", the output should be
constructSquare(s) = 900.
It can be obtained after reordering the initial string into "baa" and replacing "a" with 0 and "b" with 9.
Input/Output

[execution time limit] 3 seconds (cs)

[input] string s

Guaranteed constraints:
1 ≤ s.length < 10.

[output] integer

        */

        public
        int constructSquare(string s) {
            s = string.Concat(s.ToString().OrderBy(c => c * s.ToString().Split(c).Length));
            int max = (int)Math.Pow(10.0, s.Length);
            double sqrtMax = Math.Sqrt(max);
            for (int i = (int)(sqrtMax % 10 == 0 ? sqrtMax - 1 : sqrtMax); i * i >= max / 10; i--) {
                if (IsSubstitutionCipher(s, string.Concat((i * i).ToString().OrderBy(c => c * (i * i).ToString().Split(c).Length)))) {
                    return i * i;
                }//if (IsSubstitutionCipher(s, string.Concat((i * i).ToString().OrderBy(c => c * (i * i).ToString().Split(c).Length)))) {
            }//for (int i = (int)(sqrtMax % 10 == 0 ? sqrtMax - 1 : sqrtMax); i * i >= max / 10; i--) {
            return -1;
        }//int constructSquare(string s) {

        private bool IsSubstitutionCipher(string string1, string string2) {
            Dictionary<char, char> ht = new Dictionary<char, char>();
            Dictionary<char, char> th = new Dictionary<char, char>();
            for (int i = 0; i < string1.Length; i++) {
                if ((!ht.TryAdd(string1[i], string2[i]) && ht[string1[i]] != string2[i]) | (!th.TryAdd(string2[i], string1[i]) && th[string2[i]] != string1[i])) {
                    return false;
                }//if ((!ht.TryAdd(string1[i], string2[i]) && ht[string1[i]] != string2[i]) | (!th.TryAdd(string2[i], string1[i]) && th[string2[i]] != string1[i])) {
            }//for (int i = 0; i < string1.Length; i++) {
            return true;
        }//private bool IsSubstitutionCipher(string string1, string string2) {
    }//public class ConstructSquare {
}//namespace Algorithms.src._1_the_core._07_mirror_lake {
