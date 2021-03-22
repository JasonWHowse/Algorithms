namespace Algorithms.src._0_intro._10_rainbow_of_clarity {
    public class LineEncoding {

        /*

Given a string, return its encoding defined as follows:

First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
for example, "aabbbc" is divided into ["aa", "bbb", "c"]
Next, each substring with length greater than one is replaced with a concatenation of its length and the repeating character
for example, substring "bbb" is replaced by "3b"
Finally, all the new strings are concatenated together in the same order and a new string is returned.
Example

For s = "aabbbc", the output should be
lineEncoding(s) = "2a3bc".

Input/Output

[execution time limit] 3 seconds (java)

[input] string s

String consisting of lowercase English letters.

Guaranteed constraints:
4 ≤ s.length ≤ 15.

[output] string

Encoded version of s.
        
        */

        public
        string lineEncoding(string s) {
            string outS = "";
            int encoder = 1;
            char lastChar = s[0];
            for (int i = 1; i < s.Length; i++) {
                if (s[i] == lastChar) {
                    encoder++;
                } else {//if (s.[i] == lastChar) {
                    outS = (encoder == 1) ? outS + lastChar : outS + encoder + lastChar;
                    lastChar = s[i];
                    encoder = 1;
                }//else {
            }//for (int i = 1; i < s.Length; i++) {
            outS = (encoder == 1) ? outS + lastChar : outS + encoder + lastChar;
            return outS;
        }//string lineEncoding(string s) {
    }//public class LineEncoding {
}//namespace Algorithms.src._0_intro._10_rainbow_of_clarity {
