namespace Algorithms.src._0_intro._03_exploring_the_waters {
    public class PalindromeRearranging {

        /*

Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
palindromeRearranging(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.

Input/Output

[execution time limit] 3 seconds (cs)

[input] string inputString

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 50.

[output] boolean

true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.

        */

        public
        bool palindromeRearranging(string inputString) {
            char oddChar = '0';
            for (int i = 0; i < inputString.Length; i++) {
                if ((inputString.Length - (inputString.Replace(inputString[i] + "", "").Length)) % 2 == 1) {
                    if (oddChar=='0') {
                        oddChar = inputString[i];
                    }else if (oddChar!=inputString[i]) {//if (oddChar=='0') {
                        return false;
                    }//else if (oddChar!=inputString[i]) {
                }//if ((inputString.Length - (inputString.Replace(inputString[i] + "", "").Length)) % 2 == 1) {
            }//for (int i = 0; i < inputString.Length; i++) {
            return true;
        }//bool palindromeRearranging(string inputString) {
    }//public class PalindromeRearranging {
}//namespace Algorithms.src._0_intro._03_exploring_the_waters {
