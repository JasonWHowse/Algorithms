namespace Algorithms.src._1_the_core._07_mirror_lake {
    public class StringsConstruction {

        /*

Given two strings a and b, both consisting only of lowercase English letters, your task is to calculate how many strings equal to a can be constructed using only letters from the string b? Each letter can be used only once and in one string only.

Example

For a = "abc" and b = "abccba", the output should be stringsConstruction(a, b) = 2.

We can construct 2 strings a = "abc" using only letters from the string b.

For a = "ab" and b = "abcbcb", the output should be stringsConstruction(a, b) = 1.

Input/Output

[execution time limit] 3 seconds (cs)

[input] string a

String to construct, containing only lowercase English letters.

Guaranteed constraints:
1 ≤ a.length ≤ 105.

[input] string b

String containing needed letters, containing only lowercase English letters.

Guaranteed constraints:
1 ≤ b.length ≤ 105.

[output] integer

The number of strings a that can be constructed from the string b.

        */

        public
        int stringsConstruction(string a, string b) {
            int output = b.Split(a[0]).Length - 1;
            for(char i = 'a'; i <= 'z'; i++) {
                if (a.Split(i).Length > 1) {
                    int tempOut = (b.Split(i.ToString()).Length - 1) / (a.Split(i).Length - 1);
                    if (output > tempOut) {
                        output = tempOut;
                    }//if (output > tempOut) {
                }//if (a.Split(i).Length > 1) {
            }//for(char i = 'a'; i <= 'z'; i++) {
            return output;
        }//int stringsConstruction(string a, string b) {
    }//public class StringsConstruction {
}//namespace Algorithms.src._1_the_core._07_mirror_lake {
