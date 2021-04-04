using System.Linq;

namespace Algorithms.src._0_intro._09_eruption_of_light {
    public class BuildPalindrome {

        /*

Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.

Example

For st = "abcdc", the output should be
buildPalindrome(st) = "abcdcba".

Input/Output

[execution time limit] 3 seconds (cs)

[input] string st

A string consisting of lowercase English letters.

Guaranteed constraints:
3 ≤ st.length ≤ 10.

[output] string
        
        */

        public
        string buildPalindrome(string st) {
            for (int i = -1; i < st.Length; i++) {
                if (st[(i + 1)..].Equals(new string(st.ToCharArray().Reverse().ToArray()).Substring(0, st.Length - i - 1))) {
                    return st + new string(st.ToCharArray().Reverse().ToArray())[(st.Length - i - 1)..];
                }//if (st.Substring(i + 1).Equals(new string(st.ToCharArray().Reverse().ToArray()).Substring(0, st.Length - i - 1))) {
            }//for (int i = -1; i < st.Length; i++) {
            return st;
        }//string buildPalindrome(string st) {
    }//public class BuildPalindrome {
}//namespace Algorithms.src._0_intro._09_eruption_of_light {
