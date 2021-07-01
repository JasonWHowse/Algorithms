namespace Algorithms.src._1_the_core._07_mirror_lake {
    public class CreateAnagram {

        /*

You are given two strings s and t of the same length, consisting of uppercase English letters. Your task is to find the minimum number of "replacement operations" needed to get some anagram of the string t from the string s. A replacement operation is performed by picking exactly one character from the string s and replacing it by some other character.

Example

For s = "AABAA" and t = "BBAAA", the output should be
createAnagram(s, t) = 1;
For s = "OVGHK" and t = "RPGUC", the output should be
createAnagram(s, t) = 4.
Input/Output

[execution time limit] 3 seconds (cs)

[input] string s

Guaranteed constraints:
5 ≤ s.length ≤ 35.

[input] string t

Guaranteed constraints:
t.length = s.length.

[output] integer

The minimum number of replacement operations needed to get an anagram of the string t from the string s.

        */

        public
        int createAnagram(string s, string t) {
            foreach(char u in s) {
                if (t.IndexOf(u) != -1) {
                    t = t.Remove(t.IndexOf(u), 1);
                }//if (t.IndexOf(u) != -1) {
            }//foreach(char u in s) {
            return t.Length;
        }//int createAnagram(string s, string t) {
    }//public class CreateAnagram {
}//namespace Algorithms.src._1_the_core._07_mirror_lake {
