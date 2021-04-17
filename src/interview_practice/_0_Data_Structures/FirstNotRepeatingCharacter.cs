namespace Algorithms.src.interview_practice._0_Data_Structures {
    public class FirstNotRepeatingCharacter {

        /*

Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.

Example

For s = "abacabad", the output should be
firstNotRepeatingCharacter(s) = 'c'.

There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

For s = "abacabaabacaba", the output should be
firstNotRepeatingCharacter(s) = '_'.

There are no characters in this string that do not repeat.

Input/Output

[execution time limit] 3 seconds (cs)

[input] string s

A string that contains only lowercase English letters.

Guaranteed constraints:
1 ≤ s.length ≤ 105.

[output] char

The first non-repeating character in s, or '_' if there are no characters that do not repeat.

        */

        public
        char firstNotRepeatingCharacter(string s) {
            char b = '_';
            int l = 0;
            string[] sArr;
            for (char i = 'a'; i <= 'z'; i++) {
                sArr = s.Split(i);
                if (sArr.Length == 2) {
                    if (sArr[0].Length < l || l == 0) {
                        l = sArr[0].Length;
                        b = i;
                    }//if (sArr[0].Length<l || l==0){
                }//if(sArr.Length==2){
            }//for(char i='a';i<='z';i++){
            return b;
        }//char firstNotRepeatingCharacter(string s) {
    }//public class FirstNotRepeatingCharacter {
}//namespace Algorithms.src.interview_practice._0_Data_Structures {
