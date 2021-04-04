using System.Text.RegularExpressions;

namespace Algorithms.src._0_intro._11_land_of_logic {
    public class LongestWord {

        /*

Define a word as a sequence of consecutive English letters. Find the longest word from the given string.

Example

For text = "Ready, steady, go!", the output should be
longestWord(text) = "steady".

Input/Output

[execution time limit] 3 seconds (cs)

[input] string text

Guaranteed constraints:
4 ≤ text.length ≤ 50.

[output] string

The longest word from text. It's guaranteed that there is a unique output.

        */

        public
        string longestWord(string text) {
            string output = "";
            text = new Regex("[^ A-Za-z]").Replace(text, " ");
            foreach (string s in text.Split(" ")) {
                if (output.Length < s.Length){
                    output = s;
                }//if(out.Length<s.Length){
            }//foreach(string s in text.split("[ ]")){
            return output;
        }//string longestWord(string text) {
    }//public class LongestWord {
}//namespace Algorithms.src._0_intro._11_land_of_logic {
