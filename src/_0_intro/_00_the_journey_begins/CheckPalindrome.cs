namespace Algorithms.src._0_intro._00_the_journey_begins {
    public class CheckPalindrome {

        /*

Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.
Input/Output

[execution time limit] 3 seconds (cs)

[input] string inputString

A non-empty string consisting of lowercase characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 105.

[output] boolean

true if inputString is a palindrome, false otherwise.
        
        */

        public
        bool checkPalindrome(string g) {
            for (int i = 0; i < g.Length / 2; i++) {
                if (g[i] != g[(g.Length - 1) - i]) {
                    return false;
                }//if(g[i]!=g[(g.Length-1)-i]){
            }//for (int i = 0; i < g.Length; i++) {
            return true;
        }//public bool checkPalindrome(string g) {
    }//public class CheckPalindrome {
}//namespace Algorithms.src._0_intro._00_the_journey_begins {