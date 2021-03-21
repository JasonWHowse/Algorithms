namespace Algorithms.src._0_intro._05_rains_of_reason {
    public class VariableName {

        /*

Correct variable names consist only of English letters, digits and underscores and they can't start with a digit.

Check if the given string is a correct variable name.

Example

For name = "var_1__Int", the output should be
variableName(name) = true;
For name = "qq-q", the output should be
variableName(name) = false;
For name = "2w2", the output should be
variableName(name) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] string name

Guaranteed constraints:
1 ≤ name.length ≤ 10.

[output] boolean

true if name is a correct variable name, false otherwise.

        */

        public
        bool variableName(string name) {
            if (name[0] >= '0' && name[0] <= '9') {
                return false;
            }//if (name[0] >= '0' && name[0] <= '9') {
            for (int i = 0; i < name.Length; i++) {
                if (!((name[i] >= '0' && name[i] <= '9') || (name[i] == '_') || (name[i] >= 'A' && name[i] <= 'Z') || (name[i] >= 'a' && name[i] <= 'z'))) {
                    return false;
                }//if (!((name[i] >= '0' && name[i] <= '9') || (name[i] == '_') || (name[i] >= 'A' && name[i] <= 'Z') || (name[i] >= 'a' && name[i] <= 'z'))) {
            }//for (int i = 0; i < name.Length; i++) {
            return true;
        }//bool variableName(string name) {
    }//public class VariableName {
}//namespace Algorithms.src._0_intro._05_rains_of_reason {