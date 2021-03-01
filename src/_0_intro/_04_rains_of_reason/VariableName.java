/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_rains_of_reason;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetterOrDigit;

public class VariableName {

/*
Correct variable names consist only of English letters,
digits and underscores and they can't start with a
digit.

Check if the given string is a correct variable name.
 */

    boolean variableName(String name) {
        if(isDigit(name.charAt(0))){
            return false;
        }//if(isDigit(name.charAt(0))){
        for(int i=0;i<name.length();i++){
            if(!(isLetterOrDigit(name.charAt(i)) || name.charAt(i)=='_')){
                return false;
            }//if(!(isLetterOrDigit(name.charAt(i)) || name.charAt(i)=='_')){
        }//for(int i=0;i<name.length();i++){
        return true;
    }//boolean variableName(String name) {

/*
Input/Output

[execution time limit] 3 seconds (cs)

[input] string name

Guaranteed constraints:
1 ≤ name.length ≤ 10.

[output] boolean

true if name is a correct variable name, false otherwise.
 */

}//public class VariableName {