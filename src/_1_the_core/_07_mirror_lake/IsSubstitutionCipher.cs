using System.Collections;
using System.Collections.Generic;

namespace Algorithms.src._1_the_core._07_mirror_lake {
    public class IsSubstitutionCipher {

        /*

A ciphertext alphabet is obtained from the plaintext alphabet by means of rearranging some characters. For example "bacdef...xyz" will be a simple ciphertext alphabet where a and b are rearranged.

A substitution cipher is a method of encoding where each letter of the plaintext alphabet is replaced with the corresponding (i.e. having the same index) letter of some ciphertext alphabet.

Given two strings, check whether it is possible to obtain them from each other using some (possibly, different) substitution ciphers.

Example

For string1 = "aacb" and string2 = "aabc", the output should be
isSubstitutionCipher(string1, string2) = true.

Any ciphertext alphabet that starts with acb... would make this transformation possible.

For string1 = "aa" and string2 = "bc", the output should be
isSubstitutionCipher(string1, string2) = false.

Input/Output

[execution time limit] 3 seconds (cs)

[input] string string1

A string consisting of lowercase English characters.

Guaranteed constraints:
1 ≤ string1.length ≤ 10.

[input] string string2

A string consisting of lowercase English characters of the same length as string1.

Guaranteed constraints:
string2.length = string1.length.

[output] boolean

        */

        public
        bool isSubstitutionCipher(string string1, string string2) {
            Dictionary<char, char> ht = new Dictionary<char,char>();
            Dictionary<char, char> th = new Dictionary<char, char>();
            for(int i = 0; i < string1.Length; i++) {
                if ((!ht.TryAdd(string1[i], string2[i]) && ht[string1[i]] != string2[i]) | (!th.TryAdd(string2[i], string1[i]) && th[string2[i]] != string1[i])) {
                    return false;
                }//if ((!ht.TryAdd(string1[i], string2[i]) && ht[string1[i]] != string2[i]) | (!th.TryAdd(string2[i], string1[i]) && th[string2[i]] != string1[i])) {
            }//for(int i = 0; i < string1.Length; i++) {
            return true;
        }//bool isSubstitutionCipher(string string1, string string2) {
    }//public class IsSubstitutionCipher {
}//namespace Algorithms.src._1_the_core._07_mirror_lake {
