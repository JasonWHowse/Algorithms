namespace Algorithms.src._0_intro._05_rains_of_reason {
    public class AlphabeticShift {

        /*

Given a string, your task is to replace each of its characters by the next one in the English alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).

Example

For inputString = "crazy", the output should be alphabeticShift(inputString) = "dsbaz".

Input/Output

[execution time limit] 3 seconds (cs)

[input] string inputString

A non-empty string consisting of lowercase English characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 1000.

[output] string

The resulting string after replacing each of its characters.

        */

        public
        string alphabeticShift(string inputString) {
            char[] iS = inputString.ToCharArray();
            for(int i = 0; i < iS.Length; i++) {
                if (char.ToUpper(iS[i]) == 'Z') {
                    iS[i] = (char)(iS[i] - '');
                } else {//if (char.ToUpper(iS[i]) == 'Z') {
                        iS[i] = (char)(iS[i] + 1);
                }//else {
            }//for(int i = 0; i < iS.Length; i++) {
            return new string(iS);
        }//string alphabeticShift(string inputString) {
    }//public class AlphabeticShift {
}//namespace Algorithms.src._0_intro._05_rains_of_reason {